package model;

public enum Processador {
Intel, AMD;

	  public String toString() {
	    switch(this) {
	      case Intel:    return "Intel";
	      case AMD: return "AMD";
	      default:  return "Processador n�o cadastrado no sistema.";
	    }
	  }
}
