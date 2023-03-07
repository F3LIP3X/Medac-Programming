package Condicionales;

import java.util.Scanner;

public class Hielo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double hora;
		
		System.out.println("Introduce La hora separada por coma (0,0): ");
		
		hora = sc.nextDouble();
		
		if (hora>=0 && hora<=6 || hora==24) {
			System.out.println("Hora del LOL");
		}
		else if (hora>6 && hora<=14) {
			System.out.println("A dormir como un Campeon");
		}
		else if (hora==15) {
			System.out.println("Monster y para clase");
		}
		else if (hora>15 && hora<21.5) {
			System.out.println("Ojalá tener Programación");
		}
		else if (hora>=21.5 && hora<24) {
			System.out.println("Autorecreación procreación");
		}
		
		else {
			System.out.println("Hora equivocada");
		}
		
	}

}
