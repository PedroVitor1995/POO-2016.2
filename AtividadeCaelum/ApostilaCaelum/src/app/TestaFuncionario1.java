package app;

import domain.Data;
import domain.Funcionario;

public class TestaFuncionario1 {

	public static void main(String[] args) {
		
				Funcionario funcionario1 = new Funcionario();
				
				funcionario1.nome = "Pedro";
				funcionario1.departamentoDoTrabalho = "caixa";
				funcionario1.RG = "757767";
				funcionario1.salario = 1000;
				funcionario1.recebeAumento(50);
				
				System.out.println("salario atual: " + funcionario1.salario);
				System.out.println("ganho anual: " + funcionario1.calculaGanhoAnual());
					
				funcionario1.mostra();
				
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
				
				Funcionario funcionario3 = funcionario1;
				
				if(funcionario1 == funcionario3){
					System.out.println("siguais");
				}else{
					System.out.println("diferentes");
				}
				
				Data data = new Data();
				data.dia = 02;
				data.mes = 12;
				data.ano = 1995;
				funcionario1.dataDeEntrada = data;
				
				funcionario1.toString();
				
	}

}
