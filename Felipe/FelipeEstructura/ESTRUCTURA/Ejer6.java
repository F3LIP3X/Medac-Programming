package ESTRUCTURA;

import java.util.Scanner;

public class Ejer6 {

	public static void main(String[] args) {
		/*
		 * Implemente un programa que calcule los N primeros términos de la serie de
			Fibonacci. El número de términos se leerá por teclado.
			La sucesión de Fibonacci comienza con los números 0 y 1, y a partir de estos, cada
			término es la suma de los dos anteriores:
			0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377…
		 */
		Scanner sc = new Scanner (System.in);
		//Fumo?
		int n, fibo1 = 1, fibo2 = 1; //ESTABLECEMOS EL VALOR DE LAS VARIABLES 
		System.out.println("Cifras que quieres de la sucesion: ");
		n = sc.nextInt();
		
		System.out.println(fibo1);
		
		for (int i=2;i<=n;i++) { //EL BUCLE FOR QUE HACE LA SERIE DE FIBO
			System.out.println(fibo2);
			fibo2 = fibo1 + fibo2;
			fibo1 = fibo2 - fibo1;			
		}
		
	}

}
