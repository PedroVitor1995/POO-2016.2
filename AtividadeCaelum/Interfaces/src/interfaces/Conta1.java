package interfaces;

public interface Conta1 {
	
	public double getSaldo();
	public void deposita(double valor);
	public void saca(double valor);
	public void atualiza(double taxaSelic);
	
}
