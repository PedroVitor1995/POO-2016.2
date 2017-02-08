package app;

import modelos.ContaCorrente1;

public class TesteTributavel1 {

	public static void main(String[] args) {
		
		ContaCorrente1 cc = new ContaCorrente1();
		cc.deposita(100);
		System.out.println(cc.calculaTributos());
		
	}

}
