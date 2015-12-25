package model;

public class Funcionario {
private int idFunc;
private String nomeFunc;
private double salarioFunc;
private MatchesFunc matchesFunc;

private int codGerente;
private String cpf;
public String getCpf() {
	return cpf;
}
public void setCpf(String cpf) {
	this.cpf = cpf;
}
public int getCodGerente() {
	return codGerente;
}
public void setCodGerente(int codGerente) {
	this.codGerente = codGerente;
}

public Funcionario(int idFunc, String nomeFunc, double salarioFunc, int codGerente, String cpf){
	this.idFunc = idFunc;
	this.nomeFunc = nomeFunc;
	this.salarioFunc = salarioFunc;
	this.codGerente = codGerente;
	this.cpf = cpf;
}
public Funcionario(int idFunc, String nomeFunc, double salarioFunc, int codGerente, String cpf, MatchesFunc matchesFunc){
	this.idFunc = idFunc;
	this.nomeFunc = nomeFunc;
	this.salarioFunc = salarioFunc;
	this.codGerente = codGerente;
	this.cpf = cpf;
	this.matchesFunc = matchesFunc;
}
public int getIdFunc() {
	return idFunc;
}
public void setIdFunc(int idFunc) {
	this.idFunc = idFunc;
}
public String getNomeFunc() {
	return nomeFunc;
}
public void setNomeFunc(String nomeFunc) {
	this.nomeFunc = nomeFunc;
}
public double getSalarioFunc() {
	return salarioFunc;
}
public void setSalarioFunc(double salarioFunc) {
	this.salarioFunc = salarioFunc;
}
public boolean matches(Funcionario func1){
	if(matchesFunc.matches(func1, this)) return true;
	return false;
	
}
}
