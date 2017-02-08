package modelos;

public class Banco {
	
	int quant = 0;
	
	Conta []conta = new Conta[7];
	
	public void adiciona(Conta c){
		if(quant > 10){
			System.out.println("Array de conta estar lotado");
		}else{
			conta[quant] = c;
			quant++;
			System.out.println("Conta inserida com sucesso");
		}
	}
	public Conta pegaConta(int x){
		return conta[x];
	}
	public int pegaTotalDeContas(){
		return quant;
	}
}
