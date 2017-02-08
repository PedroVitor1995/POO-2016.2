package cap05;

import javax.swing.JOptionPane;

public class Questao05 {

	public static void main(String[] args) {
		
		String[] estacionamento = new String[10];
		String conteudo,mensagem = "Situação atual";
		int opcao = 0,numeroVaga;
		
		while(true){
			
			conteudo = JOptionPane.showInputDialog("1 - Entrada \n2 - Saída  \n3 - Listar situação atual \n4 - sair");	
			opcao = Integer.parseInt(conteudo);
			
			if(opcao == 1){
				conteudo = JOptionPane.showInputDialog("Digite o numero da vaga: ");	
				numeroVaga = Integer.parseInt(conteudo);
				conteudo = JOptionPane.showInputDialog("Digite a placa do veiculo: ");	
				estacionamento[numeroVaga] = String.valueOf(conteudo);
				JOptionPane.showMessageDialog(null,"A vaga "+numeroVaga+" estar preenchida");
			}else if(opcao == 2){
				conteudo = JOptionPane.showInputDialog("Digite o numero da vaga: ");	
				numeroVaga = Integer.parseInt(conteudo);
				estacionamento[numeroVaga] = null;
				JOptionPane.showMessageDialog(null, "Pronto o carro da vaga "+numeroVaga+" saiu");
			}else if(opcao == 3){
				for(int i = 0; i < estacionamento.length; i++){
					mensagem += i +"    "+ estacionamento[i] + "\n";
					}
				JOptionPane.showMessageDialog(null, mensagem);
			}else if(opcao == 4){
				break;
			}else{
				JOptionPane.showMessageDialog(null, "Opcao invalida!" );
			}
		}
	}
}