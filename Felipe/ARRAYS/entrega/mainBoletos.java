package entrega;

import java.util.Scanner;

public class mainBoletos {

	public static void main(String[] args) {
		Boleto ganador = new Boleto();
		Boleto miBoleto = new Boleto();
		
		Scanner sc = new Scanner(System.in);
		
		ganador.añadirNumero(3);
		ganador.añadirNumero(2);
		ganador.añadirNumero(6);
		ganador.añadirNumero(8);
		ganador.añadirNumero(1);
		ganador.añadirNumero(9);
		
		for(int i=0;i<6;i++) {
			System.out.println("Introduce el número de tu boleto Número a Número: " + (i+1));
			miBoleto.añadirNumero(sc.nextInt());
		}
		System.out.println(ganador);
		System.out.println(miBoleto);
		System.out.println(miBoleto.comparar(ganador));
	}

}
