package ESTRUCTURA;

import java.util.Scanner;

public class Ejer8 {
		//hecho con intencion a matarme
	public static void main(String[] args) {
		/*
		 * Implemente un programa que lea una frase por teclado. La salida debe mostrar la
			frase introducida, la frase en orden inverso y el número de vocales que contiene.
			(Puede usar el método length() de los String para obtener la longitud de la cadena).
		 */
		Scanner sc = new Scanner(System.in);
        
        String frase; //ALMACENA LA FRASE INTRODUCIDA
        String fraseInvertida = "";//ESTE LO USAREMOS PARA INVERTIRLA
        int contador = 0;//CONTADOR DE VOCALES
        System.out.println("Pon una frase:");
        frase=sc.next();

        for (int x = frase.length()-1 ; x >= 0 ; x--) //CUENTA LA LONGITUD DE LA PALABRA
            fraseInvertida = fraseInvertida + frase.charAt(x);

      for(int x = 0 ; x < frase.length(); x++) { //LO USAREMOS PARA DECIR LAS VOCALES QUE HAY
           if ((frase.charAt(x)=='a') || (frase.charAt(x)=='e') || (frase.charAt(x)=='i') || (frase.charAt(x)=='o') || (frase.charAt(x)=='u')){ 
              contador++;
            }
          }
        System.out.println("La frase " +  frase +". De forma invertida: "+ fraseInvertida +". Contiene " + contador + " vocales");
    }
}
