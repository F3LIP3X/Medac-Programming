package ESTRUCTURA;

import java.util.Scanner;

public class Ejer2 {

	public static void main(String[] args) {
		/*
		 * Escriba un programa similar al anterior que muestre los números en orden inverso.
		 */
	Scanner sc = new Scanner (System.in);
		
		int numIntro; //BESITOS
		
		System.out.println("Introduce un numero entero: ");
		numIntro = sc.nextInt();
		
		for (int i = numIntro ; i>=0; i--) { //BLUCLE FOR PARA MONSTRAR DESDE EL NUMERO HASTA 0
			System.out.println(i);
		}

	}

}
