package Utils;

import javax.swing.JOptionPane;

public class IOTools {
	
	static String conteudo;
	
	public static String getString(String string){
		String texto;
		conteudo = JOptionPane.showInputDialog(string);	
		texto = String.valueOf(conteudo);
		return texto;
	}
	
	public static int getInt(String string){
			int numeroInteiro = 0;
			try{
				conteudo = JOptionPane.showInputDialog(string);	
				numeroInteiro = Integer.valueOf(conteudo);
			}catch(NumberFormatException erro){
				JOptionPane.showMessageDialog(null,"Houve erro na conversao,digite apenas numeros");
			}
			return numeroInteiro;
	}
	
	public static double getReal(String string){
		
		double numeroReal = 0;
		try{
			conteudo = JOptionPane.showInputDialog(string);	
			numeroReal = Double.valueOf(conteudo);
		}catch(NumberFormatException erro){
			JOptionPane.showMessageDialog(null,"Houve erro na conversao,digite apenas numeros");
		}
		return numeroReal;
	}
	
	public static int showMessage(String string){
		
		JOptionPane.showMessageDialog(null,string);
		return 0;

	}
}
