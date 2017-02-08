package cap02;

import javax.swing.JOptionPane;

public class Questao03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String conteudo;
		float valorTransacao,valorVenal,percentualImposto,valorImposto;
		
		try {
			
			conteudo = JOptionPane.showInputDialog("Valor da transacao: ");
			valorTransacao = Float.parseFloat(conteudo);
			
			conteudo = JOptionPane.showInputDialog("Valor venal: ");
			valorVenal = Float.parseFloat(conteudo);
			
			conteudo = JOptionPane.showInputDialog("Percentual de imposto: ");
			percentualImposto = Float.parseFloat(conteudo);
			
			if (valorTransacao > valorVenal){
				valorImposto = valorTransacao * percentualImposto / 100;
				JOptionPane.showMessageDialog(null, "O valor de imposto a ser pago sobre o valor de transacao eh: " + valorImposto);
			}else{
				valorImposto = valorVenal * percentualImposto / 100;
				JOptionPane.showMessageDialog(null, "O valor de imposto a ser pago sobre o valor venal eh: " + valorImposto);
			}
		}catch(NumberFormatException erro){
			System.out.println("Houve erro na conversao, digite apenas numeros" + erro.toString());
		}
		System.exit(0);
	}
}
		