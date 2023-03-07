package Ejer7;

import java.util.Scanner;

public class Mainsito {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Dime coordenadas");
		int x = sc.nextInt();
		System.out.println("Dime la segunda coordenada");
		int y = sc.nextInt();
		Punto punto1 = new Punto (x, y);
		Punto punto2 = new Punto (x2, y2);
		System.out.println(punto1);
		Linea l1 = new Linea (punto1, punto2);
		System.out.println(l1);
		
		
	}
	

}
