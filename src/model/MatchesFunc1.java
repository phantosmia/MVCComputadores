package model;

public class MatchesFunc1 implements MatchesFunc {

	@Override
	public boolean matches(Funcionario f1, Funcionario f2) {
		if(f1.getNomeFunc().equals(f2.getNomeFunc())) return true;
		return false;
	}

}
