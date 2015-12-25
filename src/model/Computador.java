package model;

public class Computador {
private int idComputador;
private EspecificacaoComp specComputador;
private double preco;
private int qtdDisponivel;
public Computador(int idComputador, EspecificacaoComp specComputador, double preco, int qtdDisponivel) {
	// TODO Auto-generated constructor stub
	this.idComputador = idComputador;
	this.specComputador = specComputador;
	this.preco = preco;
	this.qtdDisponivel = qtdDisponivel;
}
public int getIdComputador() {
	return idComputador;
}
public void setIdComputador(int idComputador) {
	this.idComputador = idComputador;
}
public int getQtdDisponivel() {
	return qtdDisponivel;
}
public void setQtdDisponivel(int qtdDisponivel) {
	this.qtdDisponivel = qtdDisponivel;
}
public void setIDComputador(int idComputador){
	this.idComputador =  idComputador;
}
public int getIDComputador(){
	return idComputador;
}

public void setSpecComputador(EspecificacaoComp specComputador){
	this.specComputador = specComputador;
}

public void setPreco(double preco){
	this.preco = preco;
}

public double getPreco(){
	return preco;
}
public EspecificacaoComp getSpecComputador(){
	return specComputador;
}

}
