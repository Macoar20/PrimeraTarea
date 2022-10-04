package ejerciciopuntuable;

import java.util.Scanner;

public class EjercicioPuntuable3 {

	public static void main(String[] args) {
			
			int numero1;
			int numero2;
			int resto;
			int multiplicidad;
			
			Scanner ma = new Scanner(System.in);
			
			System.out.println("¿Podría darme dos números enteros?");
			numero1 = ma.nextInt();
			numero2 = ma.nextInt();
			resto = numero1%numero2;
			multiplicidad = numero2-resto;
			System.out.println("Usted necesita sumar "+ multiplicidad +" para que este sea múltiplo de "+ numero2);
			ma.close();


	}

}
