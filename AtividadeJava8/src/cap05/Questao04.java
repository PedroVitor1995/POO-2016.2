package cap05;

import java.util.Random;

import javax.swing.JOptionPane;

public class Questao04 {

	public static void main(String[] args) {
		
		int[] par = new int[10];
		int[] impar = new int[10];
		String numerosImpares = "",numeroPares = "";
		
		Random rand = new Random();
		

		for (int i = 0; i < 10; i++) {
			int numero = rand.nextInt(20);
			
			if(numero % 2 == 0){
				par[i] = numero;
			}else{
				impar[i] = numero;
			}
		}
		
		for(int i = 0; i < par.length; i++){
			if(par[i] != 0){
				numeroPares += par[i] + "  ";
			}
		}
		
		for(int i = 0; i < impar.length; i++){
			if(impar[i] != 0){
				numerosImpares += impar[i] + "  ";
			}
		}
		JOptionPane.showMessageDialog(null,"Numeros pares sorteados: "+numeroPares+"\nNumeros impares sorteados: "+numerosImpares);
	}

}
