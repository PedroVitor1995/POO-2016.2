package cap02;

import java.io.*;

public class Questao01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String conteudo;
		float valor,porcentagem,valorDesconto,valorProdutoDesconto;
		BufferedReader dado;
		
		try {
			System.out.println("Valor do produto: ");
			dado = new BufferedReader(new InputStreamReader(System.in));
			conteudo = dado.readLine();
			valor = Float.parseFloat(conteudo);
			
			System.out.println("Porcentagem de desconto: ");
			dado = new BufferedReader(new InputStreamReader(System.in));
			conteudo = dado.readLine();
			porcentagem = Float.parseFloat(conteudo);
			
			valorDesconto = valor * porcentagem / 100;
			valorProdutoDesconto = valor - valorDesconto;
			
			System.out.println("O valor do desconto foi de: " + valorDesconto);
			System.out.println("O valor do produto com desconto foi de: " + valorProdutoDesconto);
			
		}catch(IOException erro){
			System.out.println("Houve erro na entrada de dados" + erro.toString());
		}catch(NumberFormatException erro){
			System.out.println("Houve erro na conversao, digite apenas numeros" + erro.toString());
			
		}
		
	}

}

