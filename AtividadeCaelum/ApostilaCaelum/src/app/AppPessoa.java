package app;

import javax.swing.JOptionPane;

import domain.Pessoa;

public class AppPessoa {

	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa();
		
		pessoa.nome = "Pedro";
		pessoa.idade = 21;
		
		pessoa.fazAniversario();
		pessoa.fazAniversario();
		pessoa.fazAniversario();
		pessoa.fazAniversario();
		
		JOptionPane.showMessageDialog(null,"Nome: " + pessoa.nome + "\nIdade: " + pessoa.idade);
	}
}
