package app;

import javax.swing.JOptionPane;

import domain.Estacionamento;

import domain.Veiculo;

public class AppEstacionamento {
	
		public static void main(String[] args) {
			
			Estacionamento estacione = Estacionamento.getInstance();
			
			String conteudo,placa, modelo;
			int opcao;
			Veiculo veiculo;
			
			while(true){
				
				conteudo = JOptionPane.showInputDialog("=================  "+estacione.getNome()+"  ===================\n"
						+ "1 - Entrada \n2 - Saída  \n3 - Listar situação atual \n4 - sair");	
				opcao = Integer.parseInt(conteudo);
				
				if(opcao == 1){
					conteudo = JOptionPane.showInputDialog("Digite a placa: ");	
					placa = String.valueOf(conteudo);
					conteudo = JOptionPane.showInputDialog("Digite o modelo: ");	
					modelo = String.valueOf(conteudo);
					veiculo = new Veiculo(placa,modelo);
					estacione.entrada(veiculo);
				}else if(opcao == 2){
					conteudo = JOptionPane.showInputDialog("Digite a placa: ");	
					placa = String.valueOf(conteudo);
					estacione.saida(placa);
				}else if(opcao == 3){
					estacione.situacaoEstacionamento();
				}else if(opcao == 4){
					break;
				}else{
					JOptionPane.showMessageDialog(null, "Opcao invalida!" );
				}
			}
			
		}
}
