package controller;

import model.Subject;
import view.ViewGUI;

public class BuscaEstoque implements BuscaComputador {

	private ViewGUI tela;
	private Subject model;
	public BuscaEstoque(ViewGUI t, Subject s){
		tela = t;
		model = s;
	}
		@Override
		public void buscarComputador() {
			// TODO Auto-generated method stub
			tela.displayBuscaEstoque();
			
		}

}
