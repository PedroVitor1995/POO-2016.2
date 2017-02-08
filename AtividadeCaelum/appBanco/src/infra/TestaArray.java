package infra;

public class TestaArray {

	public static void main(String[] args) {
		
		int[] numeros = new int[3]; 
		numeros[0] = 10;
		numeros[1] = 11;
		numeros[2] = 12;
		
		for(int i = 0; i < 3; i++){
			System.out.println(numeros[i]);
		}
		
		/*for(int i = 2; i >= 0; --i){
			System.out.println(numeros[i]);
		}*/
	}

}
