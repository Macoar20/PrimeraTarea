package ejerciciopuntuable;

import java.util.Scanner;

public class EjercicioPuntuable2 {

	public static void main(String[] args) {
		
		int numero;
		int resto;
		int suma;
		
		Scanner ma = new Scanner(System.in);
		
		System.out.println("¿Podría darme un número entero?");
		numero = ma.nextInt();
		resto = numero%7;
		suma = 7-resto;
		System.out.println("Usted necesita sumar "+ suma +" para que este sea múltiplo de 7");
		ma.close();

	}

}
