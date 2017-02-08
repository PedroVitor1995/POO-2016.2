package app;

import modelos.Banco;
import modelos.Conta;
import modelos.ContaCorrente;
import modelos.ContaPoupanca;

public class TestarContas {

	public static void main(String[] args) {
		
		Conta c = new Conta();
		//ContaCorrente cc = new ContaCorrente();
		//ContaPoupanca cp = new ContaPoupanca();
		Conta cc = new ContaCorrente();
		Conta cp = new ContaPoupanca();
		Conta cp1 = new ContaPoupanca();
		Conta cc1 = new ContaCorrente();
		
		c.deposita(1000);
		cc.deposita(1000);
		cp.deposita(1000);
		cc1.deposita(2000);
		cp1.deposita(3000);
		
		c.atualiza(0.01);
		cc.atualiza(0.01);
		cp.atualiza(0.01);
		cc1.atualiza(0.01);
		cp1.atualiza(0.01);
		
		Banco contas = new Banco();
		
		contas.adiciona(cc);
		contas.adiciona(cp);
		contas.adiciona(cc1);
		contas.adiciona(cc1);
		
		System.out.println(c.getSaldo());
		System.out.println(cc.getSaldo());
		System.out.println(cp.getSaldo());
		System.out.println(cp1.getSaldo());
		System.out.println(cc1.getSaldo());
		
	}

}
