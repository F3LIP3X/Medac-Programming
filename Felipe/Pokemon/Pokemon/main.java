package Pokemon;

public class main {

	public static void main(String[] args) {
		
		Ataque surf = new Ataque(90,"agua", "especial", 15,100,false,0,0,0,0,0,0,0,0,0);
		Ataque rayohielo = new Ataque(90, "hielo" , "especial" , 10, 100,false,0,0,0,0,0,0,1,0,0);
		Ataque ventisca = new Ataque(120,"","especial" , 10, 100,false,0,0,0,0,0,0,1,0,0);
		Pokemon vaporeon = new Pokemon("Vaporeon" , "Agua");
		
		Pokemon charizard = new Pokemon("Charizard" , "Volador" , "Fuego");
		
				
	}

}
