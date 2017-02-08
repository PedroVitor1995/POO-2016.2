package modelos;

public class Funcionario {
	
	private String nome,cpf;
	private double salario;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public double getsalario(){
		return this.salario;
	}
	public double getBonificacao() {
		return this.salario * 0.10;
	}
	public String toString() {
		return "Nome=" + nome + ", CPF=" + cpf + ", Salario=" + salario;
	}
	
	
}
