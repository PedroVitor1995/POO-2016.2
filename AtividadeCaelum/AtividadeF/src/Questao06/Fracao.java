package Questao06;

public class Fracao {
	
	int numerador, denominador;
	
	public Fracao(int numerador, int denominador) {
		this.numerador = numerador;
		this.denominador = denominador;
	}
	
	public static int MDC(int m,int n){
		
		int j = n % m;
		
		while(j != 0){
			n = m;
			m = j;
			j = n % m;
		}
		return m;
	}
	
	public String Simplificar(int m, int n){
		
		int l = m / MDC(n, n);
		int k = n / MDC(n, n);
		
		return l +"/"+k; 
	}	
	
}
