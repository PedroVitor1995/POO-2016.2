package modelos;

public class Gerente extends Funcionario{
	
	private int senha,numeroDeFuncionariosGerenciados;
	
	public boolean autentica(int senha) {
		if (this.senha == senha) {
			System.out.println("Acesso Permitido!");
			return true;
		} else {
			System.out.println("Acesso Negado!");
			return false;
		}
	}
	public void setSenha(int senha){
		this.senha = senha;
	}
	public void setQtdFuncionarios(int quant){
		this.numeroDeFuncionariosGerenciados = quant;
	}
	public int getQtdFuncionarios(){
		return this.numeroDeFuncionariosGerenciados;
	}
	public double getBonificacao() {
		return this.getsalario() * 0.15;
	}
}
