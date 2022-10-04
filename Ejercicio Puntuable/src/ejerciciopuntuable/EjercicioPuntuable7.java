package ejerciciopuntuable;

import java.util.Scanner;

public class EjercicioPuntuable7 {

	public static void main(String[] args) {
		double milimetros;
		double centimetros;
		double metros;
		double distancia;
		Scanner ma = new Scanner(System.in);
		
		System.out.println("¿Podría darme una distancia en milímetros?");
		milimetros = ma.nextDouble();
		System.out.println("¿Podría darme una distancia en centímetros?");
		centimetros = ma.nextDouble();
		System.out.println("¿Podría darme una distancia en metros?");
		metros =  ma.nextDouble();
		distancia = (milimetros/10)+centimetros+(metros*100);
		
		System.out.println("La suma de las 3 longitudes será "+ distancia +" centímetros");
		ma.close();

	}

}
