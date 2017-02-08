package app;

import domain.Conta;

public class TestaContaArray {

	public static void main(String[] args) {
		
		Conta[] contas = new Conta[10];
		contas[4] = new Conta();
		contas[4].titular = "Mario";
		contas[4].saldo = 100;
		contas[9] = new Conta();
		
		for(int i = 0; i < 10; i++){
			System.out.println(contas[i]);
		}
		
	}

}
