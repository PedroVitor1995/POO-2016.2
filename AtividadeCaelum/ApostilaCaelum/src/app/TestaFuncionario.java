package app;

import domain.Data;
import domain.Funcionario;

public class TestaFuncionario {

	public static void main(String[] args) {
		
		//Adicionando a Questão 02
		Funcionario funcionario1 = new Funcionario();
		
		funcionario1.nome = "Pedro";
		funcionario1.departamentoDoTrabalho = "caixa";
		funcionario1.RG = "757767";
		funcionario1.salario = 1000;
		funcionario1.recebeAumento(50);
		
		System.out.println("salario atual: " + funcionario1.salario);
		System.out.println("ganho anual: " + funcionario1.calculaGanhoAnual());
			
		//Adicionando alteração da classe da Questão 03
		funcionario1.mostra();
		
		//Adicionando alteração da classe da Questão 04
		Funcionario funcionario2 = new Funcionario();
		funcionario2.nome = "Pedro";
		funcionario2.departamentoDoTrabalho = "caixa";
		funcionario2.salario = 1000;
		funcionario2.recebeAumento(50);
		
		if(funcionario1 == funcionario2){
			System.out.println("siguais");
		}else{
			System.out.println("diferentes");
		}
		
		//Adicionando alteração da classe da Questão 05
		Funcionario funcionario3 = funcionario1;
		
		if(funcionario1 == funcionario3){
			System.out.println("siguais");
		}else{
			System.out.println("diferentes");
		}
		
		//Adicionando alteração da classe da Questão 06
		Data data = new Data();
		funcionario1.dataDeEntrada = data;
		data.dia = 02;
		data.mes = 12;
		data.ano = 1995;
		
	}

}
