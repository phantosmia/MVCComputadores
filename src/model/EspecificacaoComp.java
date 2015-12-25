package model;

public class EspecificacaoComp {
private Processador processador;
private String modelo;
private int ram ;
private SO so;
private int tamanhoHD;
public EspecificacaoComp(Processador processador, String modelo,
		int ram, SO so, int tamanhoHD){
	this.processador = processador;
	this.modelo = modelo;
	this.ram = ram;
	this.so = so;
	this.tamanhoHD = tamanhoHD;
}
public Processador getProcessador() {
	return processador;
}
public void setProcessador(Processador processador) {
	this.processador = processador;
}
public String getModelo() {
	return modelo;
}
public void setModelo(String modelo) {
	this.modelo = modelo;
}
public int getRam() {
	return ram;
}
public void setRam(int ram) {
	this.ram = ram;
}
public SO getSo() {
	return so;
}
public void setSo(SO so) {
	this.so = so;
}
public int getTamanhoHD() {
	return tamanhoHD;
}
public void setTamanhoHD(int tamanhoHD) {
	this.tamanhoHD = tamanhoHD;
}
public boolean pesquisa(EspecificacaoComp specPesquisa){
	if(so != specPesquisa.so) return false;
	if(processador != specPesquisa.processador) return false;
	if((ram == 0) || specPesquisa.ram != ram) return false;
	if ((modelo != null) && (!modelo.equals("")) && (!modelo.toLowerCase().equals(specPesquisa.modelo.toLowerCase()))) 
		  return false;
	if((tamanhoHD == 0) || specPesquisa.tamanhoHD != tamanhoHD) return false;
	return true;
}


}
