package domain;

public class Funcionario1 {

	private String nome,departamentoDoTrabalho,RG;
	private Data dataDeEntrada;
	private double salario;
	private static int contador = 0;
	
	public static int getContador(){
		return Funcionario1.contador;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
		Funcionario1.contador++;
	}

	public String getDepartamentoDoTrabalho() {
		return departamentoDoTrabalho;
	}

	public void setDepartamentoDoTrabalho(String departamentoDoTrabalho) {
		this.departamentoDoTrabalho = departamentoDoTrabalho;
	}

	public String getRG() {
		return RG;
	}

	public void setRG(String rG) {
		RG = rG;
	}

	public Data getDataDeEntrada() {
		return dataDeEntrada;
	}

	public void setDataDeEntrada(Data dataDeEntrada) {
		this.dataDeEntrada = dataDeEntrada;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public void recebeAumento(double aumento){
		 this.salario += aumento;
	}
	
	public double getGanhoAnual(){
		return salario * 12;
	}
	
	public void  mostra() {
		System.out.println( "Funcionario1 [nome=" + nome + ", departamentoDoTrabalho=" + departamentoDoTrabalho + ", RG=" + RG
				+ ", dataDeEntrada=" + dataDeEntrada + ", salario=" + salario + "]");
	}
	
}
