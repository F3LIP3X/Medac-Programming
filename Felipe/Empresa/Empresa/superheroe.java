package Empresa;

public class superheroe {
	private String nombre;
	private String descripcion;
	private boolean capa;
	
	//CONSTRUCTOR VACIO
	public superheroe (String nombre) {
		this.nombre="";
		this.capa=false;
		this.descripcion="";
	}
	//CONSTRUCTOR CON PARAMETROS
		public superheroe (String nombre, String descripcion, boolean capa) {
			this.nombre=nombre;
			this.capa=capa;
			this.descripcion=descripcion;
	}
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
		
		public String toString() {
			String resultado="";
			if (capa=true) {
				resultado = "El nombre es: " + nombre + " La descripcion es: " + "y tiene capa";
			}else {
				resultado = "El nombre es: " + nombre + " La descripcion es: " + "y no tiene capa";
			}
			return resultado;
		}	
}
