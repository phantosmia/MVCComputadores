package view;

import java.util.List;

import com.db4o.ObjectSet;

public interface Observer {
public void updateComputador(List l);
public void updateComputador(String msg);
public void updateFuncionario(List matchingFuncionarios);
public void updateFuncionario(String msg);
public void updateCompra(List l);
public void updateCompra(String msg);
}
