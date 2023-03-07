package Fraccion;

public class Fraccion {
	
	private int numerador;
	private int denominador;
	
	public Fraccion() {
		this.numerador=1;
		this.denominador=1;
	}
	
	public Fraccion(int numerador,int denominador) {
		this.numerador=numerador;
		this.denominador=denominador;
	}

	public int getNumerador() {
		return numerador;
	}

	public void setNumerador(int numerador) {
		this.numerador = numerador;
	}

	public int getDenominador() {
		return denominador;
	}

	public void setDenominador(int denominador) {
		this.denominador = denominador;
	}
	
	public String toString() {
		return this.numerador + "/" + this.denominador;
	}
	
	// 2/5 + 3/5 = 5/5
	
	public Fraccion sumar(Fraccion f1) {
		int nuevoden= this.denominador * f1.denominador;
		
		int nuevonum1 = this.numerador*f1.denominador;
		int nuevonum2= this.denominador*f1.numerador;
		return new Fraccion(nuevonum1+nuevonum2,nuevoden);
	}
	public Fraccion restar(Fraccion f1) {
		int nuevoden= this.denominador * f1.denominador;
		
		int nuevonum1 = this.numerador*f1.denominador;
		int nuevonum2= this.denominador*f1.numerador;
		return new Fraccion(nuevonum1-nuevonum2,nuevoden);
	}
	
	public Fraccion multiplicar(Fraccion f7) {
		int nuevonum= this.numerador*f7.numerador;
		int nuevoden= this.denominador*f7.denominador;
		return new Fraccion(nuevonum,nuevoden);
	}
	public Fraccion dividir(Fraccion f7) {
		int nuevonum = this.numerador*f7.denominador;
		int nuevoden= this.denominador*f7.numerador;
		return new Fraccion(nuevonum,nuevoden);
	}
	
	public void simplificar() {
		
	}
}
