package model;

public class MatchesComp2 implements MatchesComp {

	@Override
	public boolean matches(HistoricoCompra h1, HistoricoCompra h2) {
		if(h1.getIdFuncionario()==h2.getIdFuncionario())
			return true;
		return false;
	}

}
