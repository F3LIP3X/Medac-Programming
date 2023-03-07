package arrays;

public class  {

	public static void main(String[] args) {
		int[] primerArray= {1,2,3,4,5,6,7};
		int[] arrayPosterior = new int [7];

		for(int i=0; i<arrayPosterior.length;i++) {
			arrayPosterior[i]=25;
		}
		for(int i=0; i<primerArray.length;i++) {
			System.out.println(arrayPosterior[i]);
		}
	}

}
