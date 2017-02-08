package modelos;

import interfaces.Conta1;

public class ContaCorrente1 implements Conta1{
	
	private double saldo;
	
	public double getSaldo() {
		return saldo;
	}
	public void deposita(double valor) {
		this.saldo += valor - 0.10;
	}
	public void saca(double valor) {
		this.saldo -= valor;
	}
	public void atualiza(double taxa) {
		this.saldo += this.saldo * taxa * 2;
	}
	public double calculaTributos(){
		return this.getSaldo() * 0.01;
	}
}
