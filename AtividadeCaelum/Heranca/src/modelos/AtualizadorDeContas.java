package modelos;

public class AtualizadorDeContas {
	
	private double saldoTotal = 0;
	private double selic;
	
	public AtualizadorDeContas(double selic){
		this.selic = selic;
	}

	public void roda(Conta c) {
		System.out.println("Saldo anterior: "+c.saldo);
		c.saldo += c.saldo * selic;
		System.out.println("Saldo atual: "+c.saldo);
		saldoTotal += c.saldo;
	}

	public double getSaldoTotal() {
		return saldoTotal;
	}
	
}
