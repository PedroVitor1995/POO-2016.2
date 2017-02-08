package app;

import javax.swing.JOptionPane;

import domain.Porta;

public class AppPorta {

	public static void verificandoPorta(Porta porta){
		
		if (porta.estaAberta()){
			JOptionPane.showMessageDialog(null,"Porta aberta");
		} else {
			JOptionPane.showMessageDialog(null,"Porta fechada");
		}
	}
	
	public static void main(String[] args) {

		Porta porta = new Porta();
		
		porta.dimensaoX = 20.0;
		porta.dimensaoY = 30.0;
		porta.dimensaoZ = 5.0;
		
		porta.pinta("Vermelho");
		porta.abre();
		
		porta.pinta("Marrom");
		verificandoPorta(porta);
		
		porta.fecha();
		verificandoPorta(porta);
		
		JOptionPane.showMessageDialog(null,"Porta \nCor: "+porta.cor+"\nDimensooes: "+porta.dimensaoX+" "
				+ " "+porta.dimensaoY+"  "+porta.dimensaoZ);
	}
}
