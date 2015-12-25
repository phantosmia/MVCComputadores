package model;

public class MatchesFunc2 implements MatchesFunc {

	@Override
	public boolean matches(Funcionario f1, Funcionario f2) {
		if(f1.getCpf().equals(f2.getCpf())) return true;
		return false;
	}

}
