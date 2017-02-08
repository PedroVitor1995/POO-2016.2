package cap02;

import javax.swing.JOptionPane;

public class Questao05 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String conteudo,sexo;
		int qtdAnosContribuicao,qtdAnosContribuicaoQueFaltaAposentadoria;
		
		//conteudo = JOptionPane.showInputDialog("Idade: ");
	//	numero = Integer.parseInt(conteudo);
		
		conteudo = JOptionPane.showInputDialog("Sexo M ou F:  ");
		sexo = String.valueOf(conteudo);
		
		conteudo = JOptionPane.showInputDialog("Quantidade de anos de contribuicao: ");
		qtdAnosContribuicao = Integer.parseInt(conteudo);
		
		if (sexo == "M"){
			qtdAnosContribuicaoQueFaltaAposentadoria = qtdAnosContribuicao - 35;
			if (qtdAnosContribuicaoQueFaltaAposentadoria >= 35){
				JOptionPane.showMessageDialog(null, "Você já tem o direito a aposentadoria ");
			}else{
				JOptionPane.showMessageDialog(null, "Falta " + qtdAnosContribuicaoQueFaltaAposentadoria + " para você se aposentar");
			}
		}else{
			qtdAnosContribuicaoQueFaltaAposentadoria = qtdAnosContribuicao - 30;
			if (qtdAnosContribuicaoQueFaltaAposentadoria >= 30){
				JOptionPane.showMessageDialog(null, "Você já tem o direito a aposentadoria ");
			}else{
				JOptionPane.showMessageDialog(null, "Falta " + qtdAnosContribuicaoQueFaltaAposentadoria + " para você se aposentar");
			}
		}
		
	}

}


