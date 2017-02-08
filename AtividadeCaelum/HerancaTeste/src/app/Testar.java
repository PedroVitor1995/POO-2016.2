package app;

import modelos.Gerente;

public class Testar {
	
	public static void main(String[] args) {
		
		Gerente gerente = new Gerente();
		
		gerente.setNome("Pedro Vitor");
		gerente.setCpf("9786");
		gerente.setSalario(5000);
		gerente.setSenha(4321);
		gerente.setQtdFuncionarios(30);
		
		System.out.println(gerente.getBonificacao());
	}
}
