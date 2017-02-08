package app;

import domain.Conta;

public class TestaConta {

	public static void main(String[] args) {
		
		Conta conta = new Conta();
		conta.titular = "Pedro Vitor";
		conta.saldo = 10000;
		
		System.out.println(conta);
	}

}
