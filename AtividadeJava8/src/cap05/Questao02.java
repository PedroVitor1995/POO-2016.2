package cap05;

import java.util.Random;

import javax.swing.JOptionPane;

public class Questao02 {

	public static void main(String[] args) {
		
		String[] meses = new String[12];
		meses[0] = "Janeiro";
		meses[1] = "Fevereiro";
		meses[2] = "Março";
		meses[3] = "Abril"; 
		meses[4] = "Maio";
		meses[5] = "Junho";
		meses[6] = "Julho";
		meses[7] = "Agosto";
		meses[8] = "Setembro";
		meses[9] = "Outubro";
		meses[10] = "Novembro";
		meses[11] = "Dezembro";
		
		Random rand = new Random();
		
		int posicao = rand.nextInt(11);

		JOptionPane.showMessageDialog(null,"Mes correspondente ao numero sorteado " +posicao+ " eh: "+meses[posicao]);
	}

}
