package cap02;

import java.util.*;

public class Questao02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int valor1,valor2,qtdVitorias;
		Scanner conteudo;
		
		try{
			
			System.out.println("Primeiro valor: ");
			conteudo = new Scanner(System.in);
			valor1 = conteudo.nextInt();
			
			System.out.println("Segundo valor: ");
			conteudo = new Scanner(System.in);
			valor2 = conteudo.nextInt();
			
			qtdVitorias = (valor1 - valor2) / 3;
			
			System.out.println("O numero de vitorias queo time lanterna precisa para alcancar o time lider eh: "+ qtdVitorias);
			
		}catch(NumberFormatException e){
			System.out.println("Houve erro na conversao, digite apenas numeros");

		}
	}

}
