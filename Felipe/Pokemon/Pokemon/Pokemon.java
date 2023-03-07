package Pokemon;

public class Pokemon {
	private String nombre;
	private String tipo1;
	private String tipo2;
	private String atack1;
	private String atack2;
	private String atack3;
	private String atack4;
	private int lvl=50;
	
	public Pokemon( ) {
		this.nombre="missigno";
		this.tipo1="normal";
		this.tipo1=null;
	}
	public Pokemon(String nombre, String tipo1, String tipo2,String atack1,String atack2,String atack3,String atack4) {
		this.nombre=nombre;
		this.tipo1=tipo1;
		this.tipo1=tipo2;
		this.atack1=atack1;
		this.atack2=atack2;
		this.atack3=atack3;
		this.atack4=atack4;
	}
	public Pokemon(String nombre, String tipo1,String atack1,String atack2,String atack3,String atack4) {
		this.nombre=nombre;
		this.tipo1=tipo1;
		this.tipo1=null;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTipo1() {
		return tipo1;
	}
	public void setTipo1(String tipo1) {
		this.tipo1 = tipo1;
	}
	public String getTipo2() {
		return tipo2;
	}
	public void setTipo2(String tipo2) {
		this.tipo2 = tipo2;
	}
	public int getLvl() {
		return lvl;
	}
	public void setLvl(int lvl) {
		this.lvl = lvl;
	}
	public String toString() {
		String resultado;
		if (this.tipo2!=null) {
			resultado += this.nombre + "es de tipo" + this.tipo1 + " y " + this.tipo2;
		}
	}
}