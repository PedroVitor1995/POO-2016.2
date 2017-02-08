package Parte1;

public class Questao04A {

	public static void main(String[] args) {
		
		int sum = 0, i = 0;
		while(i <= 100){
			System.out.println(i);
			System.out.println(sum);
			sum += i;
			i++;
		}
		System.out.println(sum);
	}

}
