package Paquete;

public class Superhéroe {
	private String nombre;
	private String descripcion;
	private boolean capa;
	
	//CONSTRUCTOR VACIO
	public Superhéroe () {
		this.nombre="";
		this.descripcion="";
		this.capa=false;
	}
	//CONSTRUCTOR CON PARAMENTROS
	public Superhéroe (String nombre, String descripcion, boolean capa) {
		this.nombre=nombre;
		this.descripcion=descripcion;
		this.capa=capa;
		
	}
	//SETTERS AND GETTERS
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public boolean isCapa() {
		return capa;
	}
	public void setCapa(boolean capa) {
		this.capa = capa;
	}
	
	//METODOS ESPECIALES
	
	public String toString () {
		String resultado= "";
		if (this.capa=false) {
			resultado =  "Nombre: " + this.nombre + "Descripción: " + this.descripcion + "No tiene capa.";
		}else {
		resultado = "Nombre: " + this.nombre + "Descripción: " + this.descripcion + "Tiene capa.";
		}
		return resultado;
	}
}