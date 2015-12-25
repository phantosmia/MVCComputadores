package model;

public enum FormaDePagamento {
	 Dinheiro, Cartao, Cheque;

	  public String toString() {
	    switch(this) {
	      case Dinheiro:    return "Dinheiro";
	      case Cartao: return "Cartao";
	      case Cheque:           return "Cheque";
	      default:  return "Forma de pagamento não aceita pelo sistema.";
	    }
	  }
}
