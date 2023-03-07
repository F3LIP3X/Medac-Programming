package ESTRUCTURA;

import java.util.Scanner;

public class Ejer5 {

	public static void main(String[] args) {
		//BADGIAL
		/*
		 * Implemente un programa que pida números hasta que se introduzca uno negativo. Mostrar entonces la media de los valores introducidos.
		 */
			Scanner sc= new Scanner(System.in);	
			double num, media=0, resultado;//CREACION DE LAS VARIABLES
			int cont =0;
			
			do{ //EL DO WHILE ES PARA QUE CUANDO META UN NUMERO MENOR DE 0 SE CORTE 
				System.out.println("Introduce un numero: ");
				num=sc.nextInt();
				if (num>=0) { 
					media+=num; //VA SUMANDO LOS NUMEROS QUE VAS INTRODUCIENDO.
					cont++; //SUMA TODOS LOS NUMEROS QUE SE VAN INTRODUCIENDO.
				}
			}while(num>=0);
			resultado=media/cont;
			System.out.println("La media es: " + resultado);
			}
		}