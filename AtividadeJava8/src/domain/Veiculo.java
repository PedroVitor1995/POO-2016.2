package domain;

public class Veiculo {
	
	private String placa,modelo;

	public Veiculo(String placa, String modelo) {
		this.placa = placa;
		this.modelo = modelo;
	}
	
	public String getPlaca() {
		return this.placa;
	}
	
	@Override
	public String toString() {
		return  "Placa:  "+placa +"  Modelo:  "+ modelo;
	}
	
}
