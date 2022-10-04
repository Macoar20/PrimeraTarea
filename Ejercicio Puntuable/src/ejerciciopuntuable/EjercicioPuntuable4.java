package ejerciciopuntuable;

import java.util.Scanner;

public class EjercicioPuntuable4 {

	public static void main(String[] args) {
		float base;
		float altura;
		double area;
		Scanner ma = new Scanner(System.in);
		System.out.println("Podría darme la base de un triángulo?");
		base = ma.nextFloat();
		System.out.println("Podría darme la altura de un triángulo?");
		altura = ma.nextFloat();
		area = base*altura/2;
		System.out.println("El área de su triángulo será "+ area);
		ma.close();
	}

}
