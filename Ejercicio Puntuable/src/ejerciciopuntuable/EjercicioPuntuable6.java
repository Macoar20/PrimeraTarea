package ejerciciopuntuable;

import java.util.Scanner;

public class EjercicioPuntuable6 {

	public static void main(String[] args) {
		
		int segundos;
		int minutos;
		int horas;
		
		Scanner ma = new Scanner(System.in);
		
		System.out.println("¿Podría darme una cantidad de segundos?");
		segundos = ma.nextInt();
		minutos = segundos/60;
		segundos = segundos%60;
		horas = minutos/60;
		minutos = minutos%60;
		System.out.println("Eso es equivalente a "+ horas +" horas "+ minutos +" minutos "+ segundos +" segundos");
		ma.close();

	}

}
