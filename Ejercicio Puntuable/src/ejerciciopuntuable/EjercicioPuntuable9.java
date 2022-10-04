package ejerciciopuntuable;

import java.util.Scanner;

public class EjercicioPuntuable9 {

	public static void main(String[] args) {
		int numero1;
		int numero2;
		boolean total;
		Scanner ma = new Scanner(System.in);
		
		System.out.println("¿Me podrías dar 2 números?");
		numero1 = ma.nextInt();
		numero2 = ma.nextInt();
		total= numero1 == numero2 ? true : false;
		System.out.println("¿Son los dos números iguales?: "+ total);
		ma.close();
	

	}

}
