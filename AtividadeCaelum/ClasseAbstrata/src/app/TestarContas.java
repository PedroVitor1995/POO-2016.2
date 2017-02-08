package app;

import modelos.Conta;
import modelos.ContaCorrente;
import modelos.ContaPoupanca;

public class TestarContas {

	public static void main(String[] args) {
		
		Conta c = new ContaCorrente();
		//ContaCorrente cc = new ContaCorrente();
		//ContaPoupanca cp = new ContaPoupanca();
		Conta cc = new ContaCorrente();
		Conta cp = new ContaPoupanca();
		
		c.deposita(1000);
		cc.deposita(1000);
		cp.deposita(1000);
		
		c.atualiza(0.01);
		cc.atualiza(0.01);
		cp.atualiza(0.01);
		
		System.out.println(c.getSaldo());
		System.out.println(cc.getSaldo());
		System.out.println(cp.getSaldo());
		
	}

}
