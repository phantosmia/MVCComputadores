package controller;

import model.Subject;
import view.ViewGUI;

public class BuscaFDetalhada implements BuscaFunc {

	private ViewGUI tela;
	private Subject model;
	public BuscaFDetalhada(ViewGUI t, Subject s){
		tela = t;
		model = s;
	}
		@Override
		public void buscarFunc() {
			// TODO Auto-generated method stub
			tela.displayBuscaFDetalhada();
			
		}

}
