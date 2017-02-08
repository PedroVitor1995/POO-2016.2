package Principal;

import javax.swing.JOptionPane;

import Utils.IOTools;

public class TestaIOTools {

	public static void main(String[] args) {
		
		int numero = IOTools.getInt("Digite um numero: ");
				
		int[] V = new int[numero-1];
		int contagemmultiplos = 0;
		
		for(int i = 0; i < V.length; i++){
			V[i] = (int)(Math.random() * 60);
		}
		
		for(int i = 0; i < V.length; i++){
			if(V[i] % 6 == 0){
				contagemmultiplos += 1;
			}
		}
		
		JOptionPane.showMessageDialog(null,"Mensagem"+contagemmultiplos);
		
		
	}

}
