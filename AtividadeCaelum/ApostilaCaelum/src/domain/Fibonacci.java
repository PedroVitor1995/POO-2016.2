package domain;

public class Fibonacci {
	
	public int calculaFibonacci(int resultado) {
		if(resultado < 2){
			return resultado;
		}else{
			return calculaFibonacci(resultado -1) + calculaFibonacci(resultado - 2);
		}
	}

}
