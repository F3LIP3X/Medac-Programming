package ESTRUCTURA;

import java.util.Scanner;

public class Ejr1 {
//na na cosas que poca gente sabe
	public static void main(String[] args) {
		/*
		 * Escriba un programa que muestre los números de 0 a N, donde N es un valor leído de teclado.
		 */
		Scanner sc = new Scanner (System.in);
		
		int numIntro;
		
		System.out.println("Introduce un numero: ");
		numIntro = sc.nextInt();
		
		for (int i = 0 ; i<=numIntro; i++) { //BUCLE FOR PARA LA SUCESION
			System.out.println(i);
		}
	}

}
