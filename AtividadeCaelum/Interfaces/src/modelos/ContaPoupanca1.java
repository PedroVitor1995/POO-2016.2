package modelos;

import interfaces.Conta1;

public class ContaPoupanca1 implements Conta1{

	private double saldo;
	
	public double getSaldo() {
		return saldo;
	}
	public void deposita(double valor) {
		this.saldo += valor;
	}
	public void saca(double valor) {
		this.saldo -= valor;
	}
	public void atualiza(double taxaSelic) {
		this.saldo += this.saldo * taxaSelic * 3;	
	}
}
