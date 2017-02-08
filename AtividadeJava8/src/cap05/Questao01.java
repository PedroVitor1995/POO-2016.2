package cap05;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Questao01 {

	public static void main(String[] args) {
		
		float[] notas = new float[5];
		float soma = 0,media;
		String conteudo;
		
		
		for(int i = 0; i < notas.length; i++){
			int j = i + 1;
			conteudo = JOptionPane.showInputDialog("Nota " +j+ " : ");
			notas[i] = Float.parseFloat(conteudo);
		}
		
		Arrays.sort(notas);
		
		for(int i = 0; i < notas.length; i++){
			soma += notas[i];
		}
		
		media = soma / notas.length;
		
		JOptionPane.showMessageDialog(null,"Notas em ordem decrescente: " +notas[4]+ " " +notas[3]+ " "
				+ "" +notas[2]+ " " +notas[1]+ " " +notas[0]+ "\nMedia aritmetica: " +media);
	}

}
