package ESTRUCTURA;

import java.util.Scanner;

public class Ejer10 {

	public static void main(String[] args) {
		/*
		 * Implementar el juego del ahorcado. El juego debe solicitar una frase al comienzo y
			mostrará la frase oculta tras cada jugada. Conforme se vayan acertando letras se irán
			descubriendo los caracteres en la frase oculta. Cada vez que el jugador falle, se
			descontará un intento. El juego termina cuando se hayan descubierto todos los
			caracteres o se hayan acabado los intentos.
		 */
		//DI NO AL MALTRATO ESTUDIANTIL
		Scanner sc = new Scanner(System.in);
		int longitud ;
		boolean sw;
		System.out.println("JUEGO DEL AHORCADO");
		System.out.println("------------------");
		System.out.println("Introduce la frase oculta");
		String frase=sc.nextLine();
		StringBuffer fraseoculta = new StringBuffer();
		StringBuffer jugador = new StringBuffer();
		StringBuffer mascara = new StringBuffer();
		fraseoculta.insert(0, frase);
		longitud = fraseoculta.length();
		/*
		 * Crear la mascara a la longitud de la frase oculta
		 */
		for (int l=0; l<longitud ; l++) {
			mascara.append("*");
		}
		int nint =longitud -1; //oportunidades de acertar 
		while(nint>=0) {
			sw = false;
			System.out.println("------------------");
			System.out.println("Introduzca una letra para la comprobación:");
			
			jugador.insert(0, sc.next());
			for (int i=0; i<longitud; i++) {
				if (fraseoculta.charAt(i) == jugador.charAt(0)) {
					//tirada correcta
					mascara.setCharAt(i, jugador.charAt(0)); 
					sw = true;
				}
			}
			if (sw==true) {
				System.out.println("La letra ha sido correcta");
				if (mascara.indexOf("*")<0) {    //esto lo vi en internet por que no iba
					//indexOf devuelve -1 si no encuentra el asterisco
					System.out.println("FELICIDADES HAS GANADOOO");
					break;
				}
			
			}else {
				System.out.println("La letra no esta dentro de la palabra" + " Te quedan: " + nint-- + " intentos.");
			}
			//pintar resultado
			System.out.println("Resultado de la tirada '" + mascara + "'");
		}
		if (nint<0){
			System.out.println("\n\n\n\n\n\n\n\n");
			System.out.println("ERES UN MANCO Y HAS PERDIDO");
		}
	}
}
	
	

