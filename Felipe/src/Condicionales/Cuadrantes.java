package Condicionales;

import java.util.Scanner;

public class Cuadrantes {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numX = 0;
		int numY = 0;
		
		System.out.println("Introduzca la valor de X: ");
		numX = sc.nextInt();
		System.out.println("Introduzca la valor de Y: ");
		numY = sc.nextInt();
		
		if (numX==0 && numY==0) {
			System.out.println("Eje de cordenadas");
		}
		
		else if (numX>=0 && numY>=0) {		
			System.out.println("Los valores corresponden al cuadrante 2.");
		}
		
		else if (numX>=0 && numY<=0) {
			System.out.println("Los valores corresponden al cuadrante 4.");
		}
		
		else if (numX<=0 && numY<=0) {
			System.out.println("Los valores corresponden al cuadrante 3.");
		}
		else {			//como esta es la unica condicion que queda con else lo mostraria porque no es ninguna de las 3
			System.out.println("Los valores corresponden al cuadrante 1.");
		}
	}

}
