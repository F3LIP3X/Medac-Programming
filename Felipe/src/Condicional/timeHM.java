package Condicional;

import java.util.Scanner;

public class timeHM {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int  horas,min,seg,segtotales;
		
		System.out.println("Cuantos segundos quiere convertir: ");
		segtotales = sc.nextInt();		
		
		horas = (segtotales/3600);
		int resto = (segtotales%3600);
		min = (resto/60);
		seg = (resto%60);
		
		System.out.println(segtotales + horas + min + seg);
		
	

	}

}
