package controller;

import model.Subject;
import view.ViewGUI;


public class BuscaCSimples implements BuscaCompra {
	private ViewGUI tela;
	private Subject model;
	public BuscaCSimples(ViewGUI t, Subject s){
		tela = t;
		model = s;
	}
		@Override
		public void buscarCompra() {
			// TODO Auto-generated method stub
			tela.displayBuscaCSimples();
			
		}


}
