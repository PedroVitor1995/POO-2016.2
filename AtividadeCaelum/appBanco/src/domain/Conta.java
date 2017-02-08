package domain;

public class Conta {

	public Conta Conta;
	public String titular;
	public double saldo;
	
	@Override
	public String toString() {
		return("Titular: " +titular+ " Saldo R$: " +saldo);
	}
}
