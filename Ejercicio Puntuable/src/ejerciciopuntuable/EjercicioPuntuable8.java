package ejerciciopuntuable;

import java.util.Scanner;

public class EjercicioPuntuable8 {

	public static void main(String[] args) {
		double infantil;
		double adulto;
		double total;
		double descuento;
		
		Scanner ma = new Scanner(System.in);
		
		System.out.println("Necesito que me digas cuantas entradas infantiles y adultas hemos vendido");
		infantil = ma.nextDouble();
		adulto = ma.nextDouble();
		infantil *= 15.50;
		adulto *= 20;
		descuento = 5/100;
		total = infantil+adulto > 100 ? infantil+adulto - descuento : infantil+adulto;
		System.out.println("Los beneficios totales serán de "+ total +" $");
		ma.close();

	}

}
