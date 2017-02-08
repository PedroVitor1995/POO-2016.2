package domain;

public class Funcionario {
	
	public String nome,departamentoDoTrabalho,RG;
	public Data dataDeEntrada;
	public double salario;

	public void recebeAumento(double aumento){
		 this.salario += aumento;
	}
	
	public double calculaGanhoAnual(){
		return salario * 12;
	}
	
	//Adicionando alteração da classe da Questão 07
	public void mostra(){
		System.out.println("Nome do funcionario: " +this.nome);
		System.out.println("Departamento: " +this.departamentoDoTrabalho);
		System.out.println("Rg: " +this.RG);
		//Adicionando alteração da classe da Questão 03
		System.out.println("Ganho Anual: " +calculaGanhoAnual());
		
		//Adicionando alteração da classe da Questão 07
		System.out.println("Dia: " + this.dataDeEntrada);
		System.out.println("Mês: " + this.dataDeEntrada);
		System.out.println("Ano: " + this.dataDeEntrada);
		
	}

}
