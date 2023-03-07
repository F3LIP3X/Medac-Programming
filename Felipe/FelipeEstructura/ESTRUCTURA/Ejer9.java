package ESTRUCTURA;

import java.util.Scanner;

public class Ejer9 {
	//me costo un poco
	public static void main(String[] args) {
		/*
		 * Implementa un juego para adivinar un número entre 1-9 con un máximo de tres
		    intentos. El número puede ser generado aleatoriamente o pedirlo por teclado.
			Después se irán pidiendo números indicando “mayor” o “menor” según sea mayor o
            menor con respecto a N. El proceso termina cuando el usuario acierta el número o
            consume los tres intentos.
		 */
		Scanner sc= new Scanner(System.in);

        int a = (int) ((Math.random() *9)+1); 
        int b; 
        int i;  

        System.out.println("El juego consiste en averiguar un número secreto de 1 al 9.");
        System.out.println("...........................................................");

        System.out.print("Tienes 3 intentos" + "Escribe un número entre 1 y 9: ");
        b = sc.nextInt();
        System.out.println("...........................................................");
        for (i=0; i<=3; i++) {  //BUCLE FOT


           if (a == b) {
             System.out.println("¡¡Enhorabuena!!");  //COMPRUEBA SI A Y B SON IGULES
             break; } 

           else if (i == 2) { //IMPRIME SI ESTA MAL Y NO ES CORRECTO
             System.out.println("¡¡Te equivocaste!!. El número correcto era: " + a); 
             break; } 

           else if (a > b) //IMPRIME SI ES MAYOR 
             System.out.println("El número secreto es mayor que " + b);
           else if (a < b)//IMPRIME SI ES MENOR
             System.out.println("El número secreto es menor que " + b);


           if (i <= 1) { //IMPRIME QUE PRUEBES DE NUEVO
            System.out.print("Prueba de nuevo: "); 
            b = sc.nextInt(); } 

           }
         }
   }