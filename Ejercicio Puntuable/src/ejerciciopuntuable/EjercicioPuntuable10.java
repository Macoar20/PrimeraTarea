package ejerciciopuntuable;

import java.util.Scanner;

public class EjercicioPuntuable10 {

	public static void main(String[] args) {
		double lanzamiento;
		Scanner ma = new Scanner(System.in);
		System.out.println("¿Cuántos metros ha recorrido el lanzamiento?");
		lanzamiento = ma.nextDouble();
		lanzamiento *= 100;
		System.out.println("La distancia recorrida en centímetros son "+ (int) lanzamiento+ " centímetros");
		ma.close();

	}

}
