package Questão1;

public class Quadrado extends Poligono {

	private static final double Mathsqrt = 0;

	public Quadrado(double base, double altura) {
		super(base, altura);
		// TODO Auto-generated constructor stub
	}
	
	public double CalculaArea() {
		double Areaquadrado = Math.pow(base,2);
		return Areaquadrado;
	}

}
