package model;

public class ItemDaCompra {
private int idComputador;
public ItemDaCompra(int idVenda, int idComputador, int qtdComprada) {
	// TODO Auto-generated constructor stub
	this.idVenda = idVenda;
	this.idComputador = idComputador;
	this.qtdComprada = qtdComprada;
}
public int getIdComputador() {
	return idComputador;
}
public void setIdComputador(int idComputador) {
	this.idComputador = idComputador;
}
public int getIdVenda() {
	return idVenda;
}
public void setIdVenda(int idVenda) {
	this.idVenda = idVenda;
}
public int getQtdComprada() {
	return qtdComprada;
}
public void setQtdComprada(int qtdComprada) {
	this.qtdComprada = qtdComprada;
}
private int idVenda;
private int qtdComprada;

}
