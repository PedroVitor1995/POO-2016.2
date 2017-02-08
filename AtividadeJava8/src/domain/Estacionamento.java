package domain;

import javax.swing.JOptionPane; 

public class Estacionamento {
	
	private static Estacionamento instace;
	
	private String nome;
	private Veiculo[] vagas;
	public int quantidadeVagas = 0;
	
	private Estacionamento(){
		this.nome = "Estacione";
		this.vagas = new Veiculo[10];
	}
	
	public String getNome() {
		return nome;
	}

	public static Estacionamento getInstance(){
		
		if (Estacionamento.instace == null){
			
			Estacionamento.instace = new Estacionamento();
			
		}
		
		return Estacionamento.instace;
		
		}
	
	public void entrada(Veiculo veiculo){
		if(quantidadeVagas <= 10){
			for(int i = 0; i < vagas.length; i++){
				if(vagas[i] == null){
					vagas[i] = veiculo;
					quantidadeVagas += 1;
					JOptionPane.showMessageDialog(null,"O carro foi estacionado na vaga "+i );
					break;
				}
			}	
		}else{
			JOptionPane.showMessageDialog(null,"O estacionamento estar lotado");
		}
	}
	public void saida(String placa){
		
		for(int i = 0; i < vagas.length; i++){
			if(vagas[i].getPlaca().equals(placa)){
				JOptionPane.showMessageDialog(null,"O carro da vaga " +i+ " saiu");	
				vagas[i] = null;
				quantidadeVagas -= 1;
			}else{
				JOptionPane.showMessageDialog(null,"A placa do carro nao consta no estacionamento!");	
			}
		}
	}
	
	public void situacaoEstacionamento(){
		String mensagem = "===============  "+getNome()+"  ===================\n";
		for(int i = 0; i < vagas.length; i++){
			mensagem += "Numero da vaga:  "+i+"  "+vagas[i]+"\n";
		}
		JOptionPane.showMessageDialog(null,mensagem);
	}

}
