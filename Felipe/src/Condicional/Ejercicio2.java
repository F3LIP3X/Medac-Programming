package Condicional;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero3cifras, comparar, num1, num2,num3, aux;
		
		System.out.println("Ponga un numero de tres cifras: ");
		numero3cifras = sc.nextInt();
		
		System.out.println("Ponga una cifra para ver si esta en el anterior dato: ");
		comparar = sc.nextInt();
		
		num1 = numero3cifras /10; 
		aux = numero3cifras%10;
		num2 = aux/10;
		num3 = aux%10;
		
		
		boolean resultado = num1==comparar || num2==comparar || num3==comparar;
		
		
		System.out.println("El resultado es: " + resultado);
		
		
		
		
		/*
		 * REALIZA UN PROGRAMA EN JAVA QUE RECIBA POR TECLADO UN NUMERO DE TRES CIFRAS Y UN NUMERO DE TRES CIFRAS Y UN NUMERO 
		 * DE UNA CIFRAS Y UN NUMERO DE UN DIGITO APAREZCA DENTRO DEL NUMERO DE TRES DIGITOS.
		 */

	}

}
