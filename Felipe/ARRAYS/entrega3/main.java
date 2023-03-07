package entrega3;

public class main {

	public static void main(String[] args) {
		ArrayRatas r = new ArrayRatas();
		
		r.añadirRatas(2);
		r.añadirRatas(2);
		r.añadirRatas(4);
		r.añadirRatas(4);
		r.añadirRatas(9);
		r.añadirRatas(9);
		r.añadirRatas(23);
		r.añadirRatas(23);
		r.añadirRatas(23);
		
		System.out.println(r.repeticiones());
	}

}
