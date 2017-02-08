package cap03;

import javax.swing.JOptionPane;

public class Questao04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String conteudo;
		int numero,i;
		
		
		conteudo = JOptionPane.showInputDialog("Numero: ");
		numero = Integer.parseInt(conteudo);
		
		for (i = 1; i <= 10; i++){
			conteudo = JOptionPane.showInputDialog(numero * i);
		}

	}

}
