package Ejer7;

public class Linea {
	private Punto punto1;
	private Punto punto2;
	
	//constructor vacio
	public Linea() {
		this.punto1=new Punto();
		this.punto2=new Punto();
	}
	//constructor con parametros
	public Linea (int x, int y) {
		this.punto1 = new Punto();
		this.punto2 = new Punto(x, y);
	}
	public Linea (int x1, int y1, int x2, int y2) {
		this.punto1 = new Punto(x1, y1);
		this.punto2 = new Punto(x2, y2);
	}
	public Linea (Punto punto1, Punto punto2) {
		this.punto1=punto1;
		this.punto2=punto2;
	}
	
	
	public Punto getPunto1() {
		return punto1;
	}
	public void setPunto1(Punto punto1) {
		this.punto1 = punto1;
	}
	public Punto getPunto2() {
		return punto2;
	}
	public void setPunto2(Punto punto2) {
		this.punto2 = punto2;
	}
	
	//funciones especiales
	public String toString() {
		return this.punto1 + "hasta" + this.punto2;
	}
	//subir bajar izq dere
	public void DesplazarV(int distancia) {
		this.punto1.moverV(distancia);
		this.punto2.moverV(distancia);
	}
	//desplazar lateralmente
	public void DesplazarH(int distancia) {
		this.punto1.moverH(distancia);
		this.punto2.moverH(distancia);
	
		public double distancia() {
	        return (Math.sqrt(Math.pow(punto1.x(),2))-(Math.pow(punto2.x(),2))+(Math.pow(punto1.y(),2)+(Math.pow(punto2.y(),2))));
	    }

	    public String getPuto2() {
	        return ""+ punto2.getx() + "" + punto2.gety();
	    }
	}
	
	
