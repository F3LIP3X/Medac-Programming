package Condicionales;

import java.util.Scanner;

public class Condicionalmedia {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double numX;
		double medit = 0;
		double cont=0;
		double resultado;
		
		do {
			System.out.println("Introduce un numero");
			numX=sc.nextInt();
			medit+=numX;
			cont++;
		}while (numX>0);
			resultado = medit/cont;
			System.out.println(resultado);
			
	
		
		
		
		/*
		 * Realizar un programa que lea usa serie de numeros y obtenga su media.
		 * Un numero negativo indicara el fin de datos.
		 * 
		 * Realizar un programa que devuelva si un numero introducido por teclado es primo o no. //double
		 */
		
	}

}
