package Empresa;

public class dimension {
	private double alto;
	private double ancho;
	private double profundidad;
	private double volumen;

	//CONSTRUCTOR VACIO
	public dimension() {
		this.alto=0;
		this.ancho=0;
		this.profundidad=0;
		this.volumen=0;
	}
	//CONSTRUCTOR CON PARAMETROS
	public dimension(double alto, double ancho, double profundidad) {
		if(this.comprobarMedidas(alto, ancho, profundidad)) {
			this.alto=alto;
			this.ancho=ancho;
			this.profundidad=profundidad;
			
		}else {
			this.alto=0.1;
			this.ancho=0.1;
			this.profundidad=0.1;
			
		}
		this.volumen=getVolumen(alto,ancho,profundidad);
	}
	//SETTERS AND GETTERS
	
	public double getAlto() {
		return alto;
	}
	
	
	
	public boolean setAlto(double alto) {
		boolean correcto= true;
		if (this.comprobarMedidas(alto, this.ancho, this.profundidad)) {
			this.alto = alto;
		}
		return correcto;
	}
	public double getAncho() {
		return ancho;
	}
	public boolean setAncho(double ancho) {
		boolean correcto= true;
		if (this.comprobarMedidas(this.alto, ancho, this.profundidad)) {
			this.ancho = ancho;
		}
		return correcto;
	}
	public double getProfundidad() {
		return profundidad;
	}
	public boolean setProfundidad(double profundidad) {
		boolean correcto = true;
		if (this.comprobarMedidas(this.alto, this.ancho, profundidad)) {
			this.profundidad = profundidad;
		}
		return correcto;
	}
	//METODOS ESPECIALES
	public boolean  comprobarMedidas(double alto, double ancho, double profundidad) {
		boolean correcto=true;
		if(alto<0.1 || ancho<0.1 || profundidad<0.1) {
			correcto=false;
			}
		return correcto;
	}
	
	public double getVolumen(double alto, double ancho, double profundidad) {
		double volumen;
		volumen = (alto * ancho * profundidad); 
		return volumen;
	}
	
	public String toString() {
		String resultado="";
		resultado = "Alto: " + this.alto + " | Ancho: " + this.ancho + " | Profundidad: " + this.profundidad + " | Volumen maximo: " + this.volumen;
		return resultado;
	}
	
	
}
