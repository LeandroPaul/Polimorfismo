package Questão1;

public class Poligono {
	protected double base;
	protected double altura;
	
	public Poligono(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	
	public  double CalculaArea() {
		double Areapoligono = this.base*this.altura;
		return Areapoligono;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	
	
	
}
