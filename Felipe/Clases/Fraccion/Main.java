package Fraccion;

public class Main {

		public static void main(String[] args) {
			Fraccion f1= new Fraccion(3,8);
			Fraccion f2= new Fraccion(2,5);
			Fraccion f3= new Fraccion(2,5);
			System.out.println(f2);
			Fraccion resultado= f2.dividir(f3); //f1+f2
			System.out.println(resultado);

	}

}
