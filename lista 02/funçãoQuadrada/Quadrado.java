package q20;

public class Quadrado {
	private Double lado;
	
	public void setLado(Double lado){
		this.lado = lado;
	}
	public Double getLado(){
		return this.lado;
	}
	
	public Double CalcularArea(){
		return (this.lado*this.lado);
	}
	public Double Calcularperimetro(){
		return (this.lado*4);
	}
}
