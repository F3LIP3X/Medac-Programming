package Paquete;

public class Dimensión {
	
	private double alto;
	private double ancho;
	private double profundidad;
	
	//CONSTRUCTOR VACIO
	public Dimensión() {
		super();
		this.alto = 0;
		this.ancho = 0;
		this.profundidad = 0;
	}
	
	//CONSTRUCTOR CON PARAMETROS
	public Dimensión(double alto, double ancho, double profundidad) {
		super();
		this.alto = alto;
		this.ancho = ancho;
		this.profundidad = profundidad;
	}
	
	//GETTERS AND SETTERS
	public double getAlto() {
		return alto;
	}

	public void setAlto(double alto) {
		this.alto = alto;
	}

	public double getAncho() {
		return ancho;
	}

	public void setAncho(double ancho) {
		this.ancho = ancho;
	}

	public double getProfundidad() {
		return profundidad;
	}

	public void setProfundidad(double profundidad) {
		this.profundidad = profundidad;
	}
	
	//PARAMETROS ESPECIALES
	public double getVolumen () {
		String resultado = "";
		
	}
	//PARA NO METER NUMEROS INVALIDOS
	
	//METODO TOSTRING
}
