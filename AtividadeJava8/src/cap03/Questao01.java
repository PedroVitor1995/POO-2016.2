package cap03;

import javax.swing.JOptionPane;

public class Questao01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String conteudo,nomeProduto;
		float valorProduto,desconto,valorComDesconto;
		
			conteudo = JOptionPane.showInputDialog("Nome do produto: ");
			nomeProduto = String.valueOf(conteudo);
			
			conteudo = JOptionPane.showInputDialog("Valor do produto: ");
			valorProduto = Float.parseFloat(conteudo);
			
			if (valorProduto < 0){
				JOptionPane.showMessageDialog(null, "O valor eh menor que zero");
			}else{
				if (valorProduto >= 50 && valorProduto < 200){
					desconto = valorProduto * 5 / 100;
					valorComDesconto = valorProduto - desconto;
					JOptionPane.showMessageDialog(null, "O nome do produto eh "+ nomeProduto +"\nO valor original do produto eh "+ valorProduto +"\nO valor do produto com desconto eh "+ valorComDesconto);
				}else if(valorProduto >= 200 && valorProduto < 500){
					desconto = valorProduto * 6 / 100;
					valorComDesconto = valorProduto - desconto;
					JOptionPane.showMessageDialog(null, "O nome do produto eh "+ nomeProduto +"\nO valor original do produto eh "+ valorProduto +"\nO valor do produto com desconto eh "+ valorComDesconto);
				}else if (valorProduto >= 500 && valorProduto < 1000){
					desconto = valorProduto * 7 / 100;
					valorComDesconto = valorProduto - desconto;
					JOptionPane.showMessageDialog(null, "O nome do produto eh "+ nomeProduto +"\nO valor original do produto eh "+ valorProduto +"\nO valor do produto com desconto eh "+ valorComDesconto);
				}else if (valorProduto >= 100){
					desconto = valorProduto * 8 / 100;
					valorComDesconto = valorProduto - desconto;
					JOptionPane.showMessageDialog(null, "O nome do produto eh "+ nomeProduto +"\nO valor original do produto eh "+ valorProduto +"\nO valor do produto com desconto eh "+ valorComDesconto);
				}
			}
		
}

}
