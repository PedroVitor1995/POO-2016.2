package app;

import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;

public class DesafioQuestao01 {

	public static void main(String[] args) {
		
		Random gerador = new Random();
		
		TreeSet<Integer> numeros = new TreeSet<Integer>();
		
		int total = 1000;
		
		for(int i=0; i<total; i++){
			numeros.add(gerador.nextInt(total));
		}
		
		Iterator<Integer> iterator = numeros.iterator();
		
		while(iterator.hasNext()){
			System.out.println(iterator.next() + " ");
		}
	}
}
