package model;

import java.util.LinkedList;
import java.util.List;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.query.Query;

import view.Observer;

public class RecursosHumanos implements Subject {
private List observers;
private List funcionarios;
private static RecursosHumanos uniqueInstance;
public static RecursosHumanos getInstance(){
	  if(uniqueInstance==null){
		  uniqueInstance = new RecursosHumanos();
	  } 
	  
	  return uniqueInstance;
	  
}
private ObjectContainer funcionariosBanco = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(), "c:/EngDeSoftware3/databaseRecursosHumanos.db4o");
private RecursosHumanos(){
	observers = new LinkedList();
	funcionarios = new LinkedList();
}
public void registerObserver(Observer o){
	observers.add(o);
}
public void removeObserver(Observer o){
	observers.remove(o);
}
public void notifyObserversAdd(){
	for(Object i: observers){
		Observer ob = (Observer)i;
		ob.updateFuncionario("Funcionario cadastrado com sucesso!");
	}
}
public void notifyObserversSearch(List matchingFuncionarios){
	for(Object i:observers){
		Observer ob = (Observer)i;
		ob.updateFuncionario(matchingFuncionarios);
	}
}
public void addFunc(int idFunc, String nomeFunc, double salarioFunc,int codGerente, String cpf){
	Funcionario funcionario = new Funcionario(idFunc, nomeFunc, salarioFunc, codGerente, cpf);
	funcionariosBanco.store(funcionario);
	funcionarios.add(funcionario);
	notifyObserversAdd();
}
public void searchFunc(Funcionario f1){
	List matchingFuncionarios = searchFuncSpec(f1);
	for(Object i:funcionarios){
		Funcionario funcionario = (Funcionario)i;
		if(!matchingFuncionarios.isEmpty())
		notifyObserversSearch(matchingFuncionarios);
	}
}
private List searchFuncSpec(Funcionario f1) {
	Query query = funcionariosBanco.query();
	
	query.descend("nomeFunc").constrain(f1.getNomeFunc());
	ObjectSet result = query.execute();
	return result;
}
}



