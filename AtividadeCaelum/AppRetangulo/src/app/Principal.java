package app;

import javax.swing.JOptionPane;

import domain.Retangulo; 

public class Principal {
	
	public static void main(String[] args){
		
		String menu = "##### RT #####";
		menu += "\n 1 - Configurar ret1";
		menu += "\n 2 - Configurar ret2";
		menu += "\n 0 - Sair \n";
		
		int op = -1;
		
		while(op != 0){
			op = getInt(menu);
			switch (op){
			case 1:
				break;
			case 2:
				break;
			case 0:
				break;				
			}
			
		}
		Retangulo ret1 = new Retangulo();
		ret1.height =  getDouble("H: ");
		ret1.width = getDouble("W: ");
		
		//Primeiro metodo
		
		//String entrada = JOptionPane.showInputDialog("H: ");
		//ret1.height = Double.valueOf(entrada);
		
		//entrada = JOptionPane.showInputDialog("W: ");
		//ret1.width = Double.valueOf(entrada);
		
		JOptionPane.showMessageDialog(null, "Ok. Area: " + ret1.area());
	}
	
	

	private static int getInt(String menu) {
		return 0;
	}



	private static Double getDouble(String msg){
		
		String entrada = JOptionPane.showInputDialog(msg);
		return Double.valueOf(entrada);
	}
}
