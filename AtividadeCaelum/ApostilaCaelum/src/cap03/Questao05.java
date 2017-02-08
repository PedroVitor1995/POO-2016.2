package cap03;

public class Questao05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long fatorial = 1;
		
        for (int n = 1; n <= 30; n++) {

            while (n > 1){
                fatorial = fatorial * n;
                break;            
            }System.out.println("Fatorial de "+n+" = "+fatorial);
        }


	}

}
