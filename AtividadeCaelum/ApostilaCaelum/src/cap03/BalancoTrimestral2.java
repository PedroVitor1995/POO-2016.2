package cap03;

public class BalancoTrimestral2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int gastosJaneiro ,gastosFevereiro,gastosMarco,gastosTrimestre;
		float mediaMensal;
		
		gastosJaneiro = 15000;
		gastosFevereiro = 23000;
		gastosMarco = 17000;
		
		gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
		mediaMensal = gastosTrimestre / 3;
		
		System.out.println("Valor da média mensal = "+ mediaMensal);

	}

}
