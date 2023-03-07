package arraysEntrega;

import java.util.Scanner;

public class ejercicio3 {
	public static void main(String[] args) {
		int tamañoArray;
		boolean palindrome = true;
		
		System.out.println("Introduce la longitud de tu palabra: ");
		Scanner Scanner = new Scanner(System.in);
		
		tamañoArray = Scanner.nextInt();
		
		char[] palabra = new char[tamañoArray];
		char[] palabraReves = new char[tamañoArray];
		
		for(int i = 0; i<tamañoArray; i++) {
			int aux = 1+i;
			System.out.println("Introduce el " + aux + " caracter: ");
			palabra[i] = Scanner.next().charAt(0);
		}
		for(int i = 0; i<tamañoArray; i++) {
			palabraReves[i] = palabra[(tamañoArray-1) - i];
			System.out.print(palabra[i]);
		}
		System.out.println("");
		
		for(int i = 0; i<tamañoArray; i++) {
			System.out.print(palabraReves[i]);
		}
		
		for (int i = 0; i<tamañoArray; i++) {
			
			if(palabra[i] == palabraReves[i]) {
				palindrome = true;
			} else {
				palindrome = false;
				break;
			}
			
		}
		
		if (palindrome) {
			System.out.println("\nTu palabra es un palindrome.");
		} else {
			System.out.println("\nTu palabra NO es un palindrome.");
		}
	}
}
