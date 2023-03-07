package arrays;

public class Ejer1 {
	public static void main(String[] args) {
		int [] Arraysito = new int [10];
		
		for (int i=0;i<Arraysito.length;i++) {
			Arraysito[i]=i+1;
		}
		for(int i=0;i<Arraysito.length;i++) {
			System.out.print(Arraysito[i]+ ",");
		}
		for (int i=1;i<Arraysito.length;i+=2) {
			Arraysito[i]=-Arraysito[i];
		}
		System.out.println("");
		for(int i=0; i<Arraysito.length;i++) {
			System.out.print(Arraysito[i]+ ",");
		}
		
	}
}