package ArrayPersona;

import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		
		Persona p1 = new Persona("Felipe", "Jose", "Toledano");
		Persona p2 = new Persona("Fernando", "Carrasco", "Domonte");
		Persona p3 = new Persona("Jose", "Luis", "Carrasco");
		
		ArrayList<Persona> ar = new ArrayList<Persona>();
		
		ar.add(p1);
		ar.add(p2);
		ar.add(p3);
		
		for(Persona p:ar) {		//for each bien rico 
			System.out.println(p.toString()); 
		}
		
		Persona p4 = new Persona(p1);
		ar.set(0, ar.get(2));
		ar.set(2, p4);
		
		for(Persona p:ar) {
			System.out.println(p.toString()); 
		}
	}

}
