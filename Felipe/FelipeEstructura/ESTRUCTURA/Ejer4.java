package ESTRUCTURA;

import java.util.Scanner;

public class Ejer4 {

	public static void main(String[] args) {
		/*
		 * Escriba un programa que calcule el factorial de un número leído por teclado (!N =
           1*2*3*4*…*(n-1) *n)
		 */
		Scanner sc = new Scanner (System.in);
		//easy
		int numIntro, resultado = 1;
		
		System.out.println("Introduce un numero entero: ");
		numIntro = sc.nextInt();
		
		for (int i = numIntro ; i>0; i--) {
			resultado = resultado*i;
			
		}
		System.out.println(resultado);
	}

}
