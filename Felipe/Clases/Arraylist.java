import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
		ArrayList<String> arrayString = new ArrayList<String>();
		
		arrayString.add("holi"); //PARA AÑADIR VALORES
		arrayString.add("adios");
		arrayString.add("uwu");
		arrayString.add("vaporeon");
		
		System.out.println(arrayString.get(2)); //PARA QUE DEVUELVA EL 2 ESPACIO DEL ARRAY
		arrayString.set(2, "onichan"); //CAMBIA EL VALOR DE DOS Y SE LE AÑADE OTRO 
		System.out.println(arrayString);
		//arrayString.remove(2); //PARA BORRAR UN VALOR DEL ARRAY
		System.out.println(arrayString);
		//while(arrayString.remove("vaporeon")); //MIENTRAS EXISTE VAPOREON SE VA A BORRAR
		System.out.println(arrayString);
		//arrayString.removeIf(i->(i.charAt(0)=='v' || i.charAt(2)=='w')); //BORRA EL CARACTER DE LAS PALABRAS QUE EMPIECEN POR V
		System.out.println(arrayString);
		arrayString.sort(null);
	
	}

}
