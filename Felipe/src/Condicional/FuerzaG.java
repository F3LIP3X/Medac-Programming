package Condicional;

import java.util.Scanner;

public class FuerzaG {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		double fuerzaG = 6.673e-11;
		
		double masa1, masa2, rvar;
		

		System.out.println("Ponga la Masa1 en KG (0,0): ");
		masa1 = sc.nextDouble();
		
		System.out.println("Ponga la Masa2 en KG (0,0): ");
		masa2 = sc.nextDouble();
		
		System.out.println("Ponga la R en KM (0,0): ");
		rvar = sc.nextDouble();
		
		double resultadoF = (fuerzaG * ((masa1 * masa2) / (rvar * rvar)));
		System.out.println(resultadoF);
	}

}
