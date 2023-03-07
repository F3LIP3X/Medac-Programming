package arrays;

import java.util.Scanner;

public class Inverso {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Numeros a introducir: ");
			int tam = sc.nextInt();
			int [] arraysito = new int [tam];
		
			for (int i=0;i<arraysito.length; i++) {
				arraysito[i]=sc.nextInt();
			}
			for (int i = arraysito.length-1; i >0; i--) {
				System.out.println(arraysito[i]);
			}
	}
}