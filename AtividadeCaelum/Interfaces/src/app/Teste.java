package app;

import interfaces.AreaCalculavel;
import modelos.Circulo;
import modelos.Quadrado;
import modelos.Retangulo;

public class Teste {

	public static void main(String[] args) {
		
		AreaCalculavel a = new Retangulo(3,2);
		AreaCalculavel a1 = new Quadrado(4);
		AreaCalculavel a2 = new Circulo(2);
		System.out.println(a.calculaArea());
		System.out.println(a1.calculaArea());
		System.out.println(a2.calculaArea());

	}

}
