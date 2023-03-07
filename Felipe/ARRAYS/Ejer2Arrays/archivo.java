package Ejer2Arrays;

public class archivo {
	
	private String nombre;
	private String contenido;
	
	private int tamaño;
	
	//CONSTRUCTOR VACIO
	public archivo() {
		this.nombre = "";
		this.contenido = "";
		this.tamaño= 0;
	}
	
	//CONSTRUCTOR CON PARAMETROS
	public archivo(String nombre, String contenido) {
		this.nombre = nombre;
		this.contenido = contenido;
		setTamaño();
	}

	//SETTERS Y GETTERS
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
		setTamaño();
	}

	public int getTamaño() {
		return tamaño;
	}

	public void setTamaño() {
		this.tamaño = contenido.length();
	}
	
	public String toString() {
		return this.nombre + "," + this.tamaño + "mb";
	}
	
}
