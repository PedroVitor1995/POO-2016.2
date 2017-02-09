package domain;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	
	List<Conta> contas = new ArrayList<>();
	
	public void adiciona(Conta c){
		contas.add(c);
	}
	public Conta pega(int x){
		return contas.get(x);
	}
	public int pegaQuantidadeDeContas(){
		return contas.size();
	}
}
