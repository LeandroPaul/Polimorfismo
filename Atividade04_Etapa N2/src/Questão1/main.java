package Questão1;

public class main {

	public static void main(String[] args) {
		Poligono a1 = new Poligono(10, 12);
		Triangulo a2 = new Triangulo(13,10);
		Quadrado a3 = new Quadrado(10,10);
		System.out.printf("Area do Poligono: %.2f",a1.CalculaArea());
		System.out.printf("\nArea do Triangulo: %.2f",a2.CalculaArea());
		System.out.printf("\nArea do Quadrado: %.2f",a3.CalculaArea());

	}

}
