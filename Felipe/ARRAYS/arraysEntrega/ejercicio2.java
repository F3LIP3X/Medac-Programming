package arraysEntrega;

import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] loteriaGanador = new int[6];
		int[] loteriaComprobar = new int [6];
		int aciertos = 0;
		
		for (int i = 0; i<loteriaGanador.length; i++) {
			int aux = 1+i;
			System.out.println("Introduzca el digito " + aux +  " del boleto ganador: ");
			Scanner scanner = new Scanner(System.in );
			
			loteriaGanador[i] = scanner.nextInt(); 
		}
		
		for (int i = 0; i<loteriaComprobar.length; i++) {
			int aux = 1+i;
			System.out.println("Introduzca el digito " + aux +  " del boleto a comprobar: ");
			Scanner scanner = new Scanner(System.in );
			
			loteriaComprobar[i] = scanner.nextInt(); 
		}
		
		for (int i = 0; i<loteriaGanador.length; i++) {
			if (loteriaGanador[i] == loteriaComprobar[i]) {
				aciertos++;
			}
		}
		
		System.out.println("El boleto comprobado, tenia " + aciertos + " numeros acertados.");
	}

}
