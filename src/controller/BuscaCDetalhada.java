package controller;

import model.Subject;
import view.ViewGUI;

public class BuscaCDetalhada implements BuscaCompra {
private ViewGUI tela;
private Subject model;
public BuscaCDetalhada(ViewGUI t, Subject s){
	tela = t;
	model = s;
}
	@Override
	public void buscarCompra() {
		// TODO Auto-generated method stub
		tela.displayBuscaCDetalhada();
		
	}

}
