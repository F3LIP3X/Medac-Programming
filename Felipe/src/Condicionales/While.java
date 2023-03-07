package Condicionales;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		do{
		System.out.println("Introduza un numero");
		num = sc.nextInt(); 	
		}while (num<=1 || num>=10 ); 
		
		

	}

}