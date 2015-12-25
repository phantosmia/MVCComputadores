package model;

public class MatchesComp1 implements MatchesComp {

	@Override
	public boolean matches(HistoricoCompra h1, HistoricoCompra h2) {
		if(h1.getData().equals(h2.getData()))
			return true;
		return false;
	}

}
