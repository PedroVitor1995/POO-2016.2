package Parte1;

public class Questao01Versao02 {
	
	public static void main(String[] args) {
		
		int sum = 0, number = 1;
		
		while(true){
			sum += number;
			number++;
			if(sum <= 1000000){
				continue;
			}else{
				break;
			}
		}
		System.out.println(sum);
		
	}
}
