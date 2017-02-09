package domain;

public class ContaPoupanca extends Conta implements Comparable<ContaPoupanca>{

	public void atualiza(double taxa) {
		this.saldo += this.saldo * taxa * 3;
	}
	
	public int compareTo(ContaPoupanca o) {
		if (this.getNumero() < o.getNumero()) {
			return -1;
		}else if (this.getNumero() > o.getNumero()) {
			return 1;
		}else{
			return 0;
		}
	}
	
	/*public int compareTo(ContaPoupanca outra) {
		return Integer.compare(this.getNumero(), outra.getNumero());
	}*/
}
