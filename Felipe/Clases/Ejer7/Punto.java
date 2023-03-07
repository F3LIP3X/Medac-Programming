package Ejer7;

public class Punto {
	private int x;
	private int y;
	
	//constructor vacio
	public Punto() {
		this.x=0;
		this.y=0;
	}
	//constructor con parametros
	public Punto(int x, int y) {
		this.x=x;
		this.y=y;
	}
	public int getX() {
		return this.x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return this.y;
	}
	public void setY(int y) {
		this.y = y;
	}
	//metodos especiales
	public String toString() {
		return "(" + this.x + "," + this.y + ")";
	}
}