package ESTRUCTURA;

import java.util.Scanner;

public class Ejer3 {

	public static void main(String[] args) {
		/*
		 * Escriba un programa que devuelva la sumatoria de un valor leído por teclado (la sumatoria de N es la suma de todos los términos desde 1… N).
		 */
		Scanner sc = new Scanner (System.in);
		
		//temiendo el ahoracado
		int numIntro, resultado = 0;
		
		System.out.println("Introduce un numero entero: ");
		numIntro = sc.nextInt();
		
		for (int i = 1 ; i<=numIntro; i++) { //ESTRUCTURA DE BUCL PARA LA SUMATORIA
			resultado = resultado+i;
			System.out.println(resultado);
		}

	}

}
