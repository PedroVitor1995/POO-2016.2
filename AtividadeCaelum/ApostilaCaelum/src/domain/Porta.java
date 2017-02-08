package domain;

public class Porta {
	
	public boolean aberta;
	public String cor;
	public double dimensaoX,dimensaoY,dimensaoZ;
	
	public void abre(){
		this.aberta = true;
	}
	
	public void fecha(){
		this.aberta = false;
	}
	
	public void pinta(String s){
		this.cor = s;
	}
	
	public boolean estaAberta(){
		return this.aberta == true ? true:false;
	}
}
