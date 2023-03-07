package Condicional;

import java.util.Scanner;

public class Salario1 {

	public static void main(String[] args) {
		/*
		 * Escriba un programa que imprima en la pantalla con el formato del ejemplo el
		 * salario semanal de una persona cuyas horas extras y horas semanales trabajadas son leidas por el teclado.
		 * Considere que en la empresa en la que trabaja dicha persona se paga a 10 euros la hora y que las horas extra se pagan a 20 euros.
		 * 40 horas trabajadas y 15 horas extras corresponden a un salario semanal de 700 euros. 
		 */

		Scanner sc = new Scanner(System.in);
		int extras,normales,ext,norm;
		
		System.out.println("Ponga las horas que ha trabajado de extras: ");
		extras = sc.nextInt();
		System.out.println("Ponga las horas que ha trabajado normalmente: ");
		normales = sc.nextInt();
		ext = extras *20;
		norm = normales *10;
		System.out.println("El total a cobrar esta semana es de: " + (norm + ext ));
		
		
	}

}
