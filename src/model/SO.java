package model;

public enum SO {
	  LINUX, OSX, Windows;

	  public String toString() {
	    switch(this) {
	      case LINUX:    return "LINUX";
	      case OSX: return "OS X";
	      case Windows:           return "Windows";
	      default:  return "SO desconhecido pelo sistema.";
	    }
	  }
}
