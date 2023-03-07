package ESTRUCTURA;

import java.util.Scanner;

public class Ejer7 {

	public static void main(String[] args) {
		/*
		 * Escriba un programa que devuelva si un número introducido por teclado es primo.
			(Un número primo es aquel que solo es divisible por 1 y por él mismo. Piense bien las
			condiciones).
		 */
		Scanner sc = new Scanner(System.in);
		boolean primo=true;
		System.out.println("Ponga un numero para comprobar si es decimal");
		int numero = sc.nextInt();
		
		if (numero==2 || numero==3 || numero==5 || numero==1) { //VALORES DEL IF EN LAS QUE SON ESPECIALES
			System.out.println("Este numero es primo");
		}
		else if (numero==4) {
			System.out.println("Este numero no es primo");
		}
		
		
		for (int i = 2; i<numero/2; i++) { //BLCLE DE FOR QUE DETERMINA SI ES PRIMO O NO
			if (numero%i==0) {
				primo=false;
			}
		}	
		if (primo==false) { //IMPRIME SI ES O NO ES PRIMO
			System.out.println("NO es primo");
		}else {
			System.out.println("Es primo");
		}
		
		
		
		
		
		
		
		
		
		
		//Realizar un programa que devuelva si un numero introducido por teclado es primo o no. //double
		
	}

}
