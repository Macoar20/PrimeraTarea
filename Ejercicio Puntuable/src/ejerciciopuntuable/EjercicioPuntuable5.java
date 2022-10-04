package ejerciciopuntuable;

import java.util.Scanner;

public class EjercicioPuntuable5 {

	public static void main(String[] args) {
		int a;
		int b;
		int c;
		int x;
		int y;
		
		Scanner ma = new Scanner(System.in);
		
		System.out.print("Podría darme un valor para a ");
		a = ma.nextInt();
		System.out.print("Podría darme un valor para b ");
		b = ma.nextInt();
		System.out.print("Podría darme un valor para c ");
		c = ma.nextInt();
		System.out.print("Podría darme un valor para x ");
		x = ma.nextInt();
		y = a*(x*x)+(b*x)+c;
		System.out.print("El valor de Y será: "+ y );
		ma.close();

	}

}
