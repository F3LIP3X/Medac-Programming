package Condicional;

import java.util.Scanner;

public class Ecuacion2º {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double valorA,valorB,valorC;
		
		System.out.println("Ponga el valor de A: ");
		valorA = sc.nextDouble();
		
		System.out.println("Ponga el valor de B: ");
		valorB = sc.nextDouble();
		
		System.out.println("Ponga el valor de C: ");
		valorC = sc.nextDouble();
		
		double positiva = ((-valorB) + Math.sqrt(valorB * valorB - 4 *valorA *valorC))/ ( 2 * valorA);
		double negativa = ((-valorB) - Math.sqrt(valorB * valorB - 4 *valorA *valorC))/ ( 2 * valorA);
		
		
		System.out.println("Positivo: " + positiva);
		System.out.println("Negativo: " + negativa);
	}

}
