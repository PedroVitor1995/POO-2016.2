package domain;

public class Conta {

	protected int numero;
	protected double saldo;
	
	
	public double getSaldo(){
		return this.saldo;
	}
	public void deposita(double valor){
		this.saldo += valor;
	}	
	public void saca(double valor){
		this.saldo -= valor;
	}
	public void atualiza(double taxa){
		this.saldo += this.saldo * taxa;
	}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
}
