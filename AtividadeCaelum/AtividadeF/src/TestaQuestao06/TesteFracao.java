package TestaQuestao06;

import Utils.IOTools;

import Questao06.Fracao;

public class TesteFracao {

	public static void main(String[] args) {
		
		IOTools.getInt("Numerador e denominador:");
		Fracao.MDC(1, 2);
	}

}
