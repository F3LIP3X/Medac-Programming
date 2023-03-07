package Condicional;

import java.util.Scanner;

public class variables {

	public static void main(String[] args) {
		int valor1,valor2,valor3;
		System.out.println("Este programa cambia el valor de los datos de A a B:");
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Ponga el primer Valor A: ");
			
			valor1 = sc.nextInt();
			
			System.out.println("Ponga el segundo valor B: ");
			
			valor2 = sc.nextInt();
		}
		valor3 = valor1;
		valor1 = valor2;
		valor2 = valor3;
			
		System.out.println("El nuevo valor de A es: " + valor1 + " y el nuevo valor de B es: " +valor2 );
			
		
		/*
		 *  Escribe un programa que intercabie el valor de dos variables de tipo entero leídas por teclado. Imprima en la pantalla 
		 *  los valores de las variables antes de las variables antes y despues del intercambio.
		 */
		
		
	}

}
