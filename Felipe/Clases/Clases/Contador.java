package Clases;

public class Contador {
private int numero;
	//constructor vacio
	public Contador () {
		this.numero=0;
	}
	//constructor con parametro
	public Contador(int numero) {
		
	}
	//getters
	public int getNumero() {
		return this.numero;
	}
	//setter
	public void setNumero(int numero) {
		this.numero=numero;
	}
	//metodos especificos
	public void incrementar () {
		this.numero++;
	}
	public void decrementar ()	{
		this.numero--;
	}
}
