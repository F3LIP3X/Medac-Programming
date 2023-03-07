package Cubatas;

public class cubata {
	
	private String alcohol;	
	private String mezclas;
	private int hielo;
	private boolean limon;
	private boolean naranja;
	private int capacidad;
	private int cantidad;

	//constructor vacio
	public cubata () {
		this.alcohol="";
		this.mezclas="";	
		this.hielo=0;
		this.limon=false;
		this.naranja=false;
		this.capacidad=0;
		this.cantidad=0;
	}
	//constructor con parametro
	public cubata(String alcohol,String mezclas,int hielo,boolean limon,boolean naranja,int capacidad,int cantidad) {
		this.alcohol=alcohol;
		this.mezclas=mezclas;
		if (hielo>0) {
			this.hielo=hielo;
		}else {
			this.hielo=2;
		}
		
		if (capacidad>0) {
			this.capacidad=capacidad;
			this.cantidad=capacidad;
		}else {
			this.capacidad=500;
			this.cantidad=500;
		}
		this.limon=limon;
		this.naranja=naranja;
		
	}
	//getters
	public String getAlcohol() {
		return this.alcohol;
	}
	public String getMezclas() {
		return this.mezclas;
}
	public int getHielo() {
		return this.hielo;
	}
	public boolean getLimon() {
		return this.limon;
	}
	public boolean getNaranja() {
		return this.naranja;
	}
	public int getCapacidad() {
		return this.capacidad;
	}
	public int getCantidad() {
		return this.cantidad;
	}
	
	//setter
	public void setAlcohol(String alcohol) {
		this.alcohol=alcohol;
	}
	public void setMezclas (String mezclas) {
		this.mezclas=mezclas;
	}
	public void setHielo(int hielo) {
		this.hielo=hielo;
		if (hielo>0) {
			this.hielo=0;
	}else {
		this.hielo=2;}
		
	}
	public void setLimon(boolean limon) {
		this.limon=limon;
	}
	public void setNaranja(boolean naranja) {
		this.naranja=naranja;
	}
	public void setCapacidad(int capacidad) {
		this.capacidad=capacidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad=cantidad;
		if (cantidad>0) {
			this.cantidad=cantidad;
		}else if(cantidad>this.capacidad) {
			this.cantidad=500;
		}else {
			this.cantidad=0;
		}
	}
	
	//metodos especificos
	public void hechar () {
		this.cantidad=capacidad;
	}
	public void beber (int trago)	{
		this.setCantidad(this.cantidad-trago);
	}
	public void AñadirHielo () {
		this.hielo++;
	}
	public void Aguarse () {
		if (this.hielo>0) {
			
		}
		
		this.cantidad++;21
		
	}
	public void hidalgo() {
		this.cantidad=0;
	}
}