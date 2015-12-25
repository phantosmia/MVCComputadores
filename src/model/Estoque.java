package model;

import java.util.LinkedList;
import java.util.List;

import view.Observer;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.query.Query;

public class Estoque implements Subject {
	private List observers;
	private List computadores;
	private Estoque estoque;
	/**
	 * DB4o
	 */
	private ObjectContainer data = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(), "c:/EngDeSoftware3/database.db4o");

	/**
	 * Singleton
	 */
	private static Estoque uniqueInstance;

	// construtor private
	private Estoque() {
		observers = new LinkedList();
		computadores = new LinkedList();
	}

	public static Estoque getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new Estoque();
		}
		return uniqueInstance;
	}

	/**
	 * Observer
	 */
	public void registerObserver(Observer o) {
		observers.add(o);
	}

	public void removeObserver(Observer o) {
		observers.remove(o);
	}

	public void notifyObserversAdd() {
		for (Object i : observers) {
			Observer ob = (Observer) i;
			ob.updateComputador("Computador cadastrado com sucesso!\n");
		}
	}

	public void notifyObserversSearch(List result) {
		for (Object i : observers) {
			Observer obs = (Observer) i;
			obs.updateComputador(result);
		}
	}

	/**
	 * Estoque
	 */
	public void addComput(int idComputador, EspecificacaoComp specComputador,
			double preco, int qtdDisponivel) {
		Computador computador = new Computador(idComputador, specComputador,
				preco, qtdDisponivel);
		data.store(computador);
		notifyObserversAdd();
	}

	public void searchComp(EspecificacaoComp spec) {
		List matchingComputers = searchCompSpec(spec);
		if (!matchingComputers.isEmpty())
			notifyObserversSearch(matchingComputers);
	}

	private List searchCompSpec(EspecificacaoComp spec) {
		Query query = data.query();
		// descend (nome do atributo).
		// constrain (objeto)
		
		query.descend("specComputador").constrain(spec);
		ObjectSet result = query.execute();
		return result;
	}

}
