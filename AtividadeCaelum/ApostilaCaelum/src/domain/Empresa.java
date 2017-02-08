package domain;

public class Empresa {
	
	//Adicionando Questao01
	public String cnpj,nome;
	public Funcionario[] empregados;
	public int posicao = 0;
	
	//Adicionando Questao02
	public void adiciona(Funcionario funcionario){
		if(posicao < empregados.length){
			this.empregados[posicao] = funcionario;
			this.posicao++;
		}
	}
	
	//Adicionando Questao04
	public void mostraEmpregados() {
		for (int i = 0; i < this.empregados.length; i++) {
			System.out.println("Funcionário na posição: " +i);
			System.out.println("Salario: " + empregados[i].salario);
			}
		}
}
