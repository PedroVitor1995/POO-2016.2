package app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class DesafioQuestao02 {

	public static void main(String[] args) {
		
		Random gerador = new Random();
		
		List<Integer> numeros = new ArrayList<Integer>();
		
		int total = 1000;
		
		for(int i=0; i<total; i++){
			numeros.add(gerador.nextInt(total));
		}
		
		Collections.sort(numeros);
		
		for(int i=0; i<total; i++){
			System.out.println(numeros.get(i));
		}
	}
}
