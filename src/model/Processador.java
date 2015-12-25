package model;

public enum Processador {
Intel, AMD;

	  public String toString() {
	    switch(this) {
	      case Intel:    return "Intel";
	      case AMD: return "AMD";
	      default:  return "Processador não cadastrado no sistema.";
	    }
	  }
}
