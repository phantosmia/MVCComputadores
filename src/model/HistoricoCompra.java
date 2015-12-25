package model;
import java.util.Date;

public class HistoricoCompra {
private ItemDaCompra itemDaCompra;
private MatchesComp matchesCompra;
private int idFuncionario;
private int idCliente;
private Date data;
private FormaDePagamento formaDePagamento;
public int getIdFuncionario() {
	return idFuncionario;
}
public HistoricoCompra(ItemDaCompra itemDaCompra,
		int idFuncionario, int idCliente, Date data, FormaDePagamento
		formaDePagamento){
	this.itemDaCompra = itemDaCompra;
	this.data = data;
	this.formaDePagamento = formaDePagamento;
	this.idCliente = idCliente;
	this.idFuncionario = idFuncionario;
	
}
public HistoricoCompra(ItemDaCompra itemDaCompra,
		int idFuncionario, int idCliente, Date data, FormaDePagamento
		formaDePagamento, MatchesComp matchesCompra){
	this.itemDaCompra = itemDaCompra;
	this.data = data;
	this.formaDePagamento = formaDePagamento;
	this.idCliente = idCliente;
	this.idFuncionario = idFuncionario;
	this.matchesCompra = matchesCompra;
}
public void setIdFuncionario(int idFuncionario) {
	this.idFuncionario = idFuncionario;
}
public ItemDaCompra getItemDaCompra() {
	return itemDaCompra;
}
public void setItemDaCompra(ItemDaCompra itemDaCompra) {
	this.itemDaCompra = itemDaCompra;
}
public MatchesComp getMatchesCompra() {
	return matchesCompra;
}
public void setMatchesCompra(MatchesComp matchesCompra) {
	this.matchesCompra = matchesCompra;
}
public ItemDaCompra getIdCompra() {
	return itemDaCompra;
}
public void setIdCompra(ItemDaCompra itemDaCompra) {
	this.itemDaCompra = itemDaCompra;
}
public int getIdCliente() {
	return idCliente;
}
public void setIdCliente(int idCliente) {
	this.idCliente = idCliente;
}
public Date getData() {
	return data;
}
public void setData(Date data) {
	this.data = data;
}
public FormaDePagamento getFormaDePagamento() {
	return formaDePagamento;
}
public void setFormaDePagamento(FormaDePagamento formaDePagamento) {
	this.formaDePagamento = formaDePagamento;
}

public boolean matches(HistoricoCompra h){
	if(matchesCompra.matches(h, this)) return true;
	return false;
	
}
}
