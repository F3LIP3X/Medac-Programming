package arraysEntrega;

import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arraisito1 = new int[5];
		int[] arraisito2 = new int[5];
		
		
		for (int i = 0; i<arraisito1.length; i++) {
			
			System.out.println("Introduzca el resultado: ");
			Scanner scanner = new Scanner(System.in);
			arraisito1[i] = scanner.nextInt();
			
			arraisito2[i] = arraisito1[i] - arraisito1[0];
		}
		
		for (int i = 0; i<arraisito1.length; i++) {
			
			System.out.print("[" + arraisito2[i] + "] ");
			
		}
		
	}

}
