package Condicionales;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int h1,min1;
		int h2,min2;
		int minTotales1, minTotales2, mintotales;
		int horasfin, minfin;				// (15min es 0,25) (30min es 0,50) (45min es 0,75) (en punto es 0,100)(0,0): ");
		
		System.out.println("Introduzca las Horas");
		h1 = sc.nextInt();
		
		System.out.println("Introduzca los minutos");
		min1 = sc.nextInt();
		
		System.out.println("Introduzca las otras horas");
		h2 = sc.nextInt();
		
		System.out.println("Introduzca los otros minutos");
		min2 = sc.nextInt();
		
		minTotales1 = (h1 * 60) + min1;
		minTotales2 = (h2 * 60) + min2;
		
		if (minTotales1 < minTotales2) {
			mintotales = (minTotales2 - minTotales1);
		}
		else {
			mintotales = (1440 - minTotales1) + minTotales2;
		}
		horasfin = (mintotales/60);
		minfin = (mintotales%60);
		
		System.out.println("La diferencia de horas es " + horasfin + ":" + minfin);
}
}
