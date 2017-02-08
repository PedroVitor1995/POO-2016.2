package cap02;

import javax.swing.JOptionPane;

public class Questao04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String conteudo;
		float nota1,nota2,trabalho,media;
		
			
			conteudo = JOptionPane.showInputDialog("Valor da nota 1: ");
			nota1 = Float.parseFloat(conteudo);
			
			conteudo = JOptionPane.showInputDialog("Valor da nota 2: ");
			nota2 = Float.parseFloat(conteudo);
			
			conteudo = JOptionPane.showInputDialog("Valor do trabalho: ");
			trabalho = Float.parseFloat(conteudo);
			
			media = (nota1 + nota2 + trabalho) / 3;
			
			if (media >= 6){
				JOptionPane.showMessageDialog(null, "Aprovado" );
			}else{
				JOptionPane.showMessageDialog(null, "Reprovado" );
			}		
	}

}
