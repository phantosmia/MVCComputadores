package model;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.query.Query;

import view.Observer;

public class RegistroDeCompras implements Subject {
	private List observers;
	private List compras;
	private static RegistroDeCompras uniqueInstance;
	public static RegistroDeCompras getInstance(){
		  if(uniqueInstance==null){
			  uniqueInstance = new RegistroDeCompras();
		  } 
		  return uniqueInstance;
	}
	private ObjectContainer comprasBanco = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(), "c:/EngDeSoftware3/databaseRegistroDeCompras.db4o");
	private RegistroDeCompras(){
		observers = new LinkedList();
		compras = new LinkedList();
	}

	public void registerObserver(Observer o) {
		observers.add(o);
	}

	public void removeObserver(Observer o) {
		observers.remove(o);
	}

	public void notifyObserversAdd() {
		for (Object i : observers) {
			Observer obs = (Observer) i;
			obs.updateCompra("Compra cadastrada com sucesso");
		}
	}
	public void addComp(ItemDaCompra itemDaCompra,
			int idFuncionario, int idCliente, Date data, FormaDePagamento
			formaDePagamento){
		HistoricoCompra historico = new HistoricoCompra(itemDaCompra, idFuncionario, idCliente,data, formaDePagamento);
		compras.add(historico);
		comprasBanco.store(historico);
		notifyObserversAdd();
	}
	public void notifyObserversSearch(List result) {
		for (Object i : observers) {
			Observer obs = (Observer) i;
			obs.updateCompra(result);
		}
	}
	public void searchPurchase(HistoricoCompra h1){
		List matchingCompras = searchPurchaseEsp(h1);
		//Query query = comprasBanco.query();
		//query.descend("esp").constrain(h1);
		//ObjectSet result = query.execute();
		for(Object i:compras){
			HistoricoCompra historico = (HistoricoCompra)i;
			if(!matchingCompras.isEmpty())
				notifyObserversSearch(matchingCompras);
		}
		 
		// return result; 
	}
	public List searchPurchaseEsp(HistoricoCompra h1){
		Query query = comprasBanco.query();
		query.descend("idFuncionario").constrain(h1.getIdFuncionario());
		ObjectSet result = query.execute();
		return result;
	}
	
	
}
