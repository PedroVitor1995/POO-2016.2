package cap03;

import javax.swing.JOptionPane;

public class Questao02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String conteudo;
		int resistencia1,resistencia2,resistencia3,resistencia4,resistenciaEquivalente,maior,menor;
		
			conteudo = JOptionPane.showInputDialog("Resistencia 1: ");
			resistencia1 = Integer.parseInt(conteudo);
			
			conteudo = JOptionPane.showInputDialog("Resistencia 2: ");
			resistencia2 = Integer.parseInt(conteudo);
			
			conteudo = JOptionPane.showInputDialog("Resistencia 3: ");
			resistencia3 = Integer.parseInt(conteudo);
			
			conteudo = JOptionPane.showInputDialog("Resistencia 4: ");
			resistencia4 = Integer.parseInt(conteudo);
			
			resistenciaEquivalente = resistencia1 + resistencia2 + resistencia3 + resistencia4;
			
			
			if (resistencia1 < resistencia2 && resistencia1 < resistencia3 && resistencia1 < resistencia4){
				menor = resistencia1;
			}else if(resistencia2 < resistencia3 && resistencia2 < resistencia4){
				menor = resistencia2;
			}else if(resistencia3 < resistencia4){
				menor = resistencia3;
			}else{
				menor = resistencia4;
			}
			
			if (resistencia1 > resistencia2 && resistencia1 > resistencia3 && resistencia1 > resistencia4){
				maior = resistencia1;
			}else if(resistencia2 > resistencia3 && resistencia2 > resistencia4){
				maior = resistencia2;
			}else if(resistencia3 > resistencia4){
				maior = resistencia3;
			}else{
				maior = resistencia4;
			}
			
			JOptionPane.showInputDialog("Resistencias fornecidas \n"+ resistencia1 + ","+ resistencia2 + "," + resistencia3 + "," + resistencia4+"\nA resistencia equivalenta eh "+ resistenciaEquivalente +"\nA maior resistencia eh " + maior +"\nMenor resistencia eh " +menor);

	}

}
