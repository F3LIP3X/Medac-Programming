package Condicional;

import java.util.Scanner;

public class EjerExam {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	int cm, metros, km, cmtotales;
	
	System.out.println("Introduce el numero en centrimetros: ");
	
	cmtotales = sc.nextInt();

	km = cmtotales/100000;
	int resto = cmtotales%100000;
	metros = resto/100;
	cm = resto%100;
	System.out.println("Los cm son: " + cm + " Los metros son: " + metros + " metros " + "y en km son: " + km );	
			
	
			
		
	}

}
