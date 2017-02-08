package domain;

public class Retangulo {
	
	public double width;
	public double height;
	public Ponto PontodeOrigem;
	
	public double area(){
		double area = this.width * this.height;
		return area;
	}
	
	public double perimetro() {
		return 2 * this.width + 2 * this.height;
	}
}
