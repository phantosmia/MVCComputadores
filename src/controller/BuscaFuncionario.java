package controller;

import model.Subject;

import view.ViewGUI;

public class BuscaFuncionario implements BuscaComputador {

	private ViewGUI tela;
	private Subject model;
	public BuscaFuncionario(ViewGUI t, Subject s){
		tela = t;
		model = s;
	}
		@Override
		public void buscarComputador() {
			// TODO Auto-generated method stub
			tela.displayBuscaFuncionario();
			
		}

}
