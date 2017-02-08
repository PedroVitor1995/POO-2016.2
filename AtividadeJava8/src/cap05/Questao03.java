package cap05;

import javax.swing.JOptionPane;

public class Questao03 {

	public static void main(String[] args) {

		int[][] imagem = new int[40][40];
		String valores = "";
		
		
		for(int linha = 0; linha < 40; linha++){
			for(int coluna = 0; coluna < 40; coluna++){
				imagem[linha][coluna] = (int)(Math.random() * 255);
			}
		}
		
		for(int linha = 0; linha < imagem.length; linha++){
			for(int coluna = 0; coluna < imagem[linha].length; coluna++){
				valores += imagem[linha][coluna]+"   ";
			}
			valores += "\n";
		}
		
		JOptionPane.showMessageDialog(null,"Valores gerados \n"+valores);
	}

}
