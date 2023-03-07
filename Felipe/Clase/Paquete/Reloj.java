package Paquete;

public class Reloj {
	/*
	 * Escriba una clase que represente un reloj que señale la hora, el minuto y el
		segundo. La clase dispondrá de dos constructores, uno sin parámetros que pone el
		reloj a 0:0:0 y otro al que se le pasa la hora, los minutos y los segundos. Se deben
		implementar los siguientes métodos:
		• Uno que da la hora, los minutos y los segundos, separados por el carácter “:”,
		en una cadena.
		• Otro que también da la hora pero en formato 24 horas (como el anterior) o
		en formato 12, en cuyo caso debe distinguir entre “am” (para las horas de 0
		a 11) o “pm” (para las horas de 12 a 23), también en una cadena.
		• Un método para poner el reloj en hora. Se le pasa la hora y los minutos,
		poniendo los segundos a 0.
		• Un método para poner el reloj en hora al que, además, se le pasan los
		segundos.
		• Un método para poner la hora especificando si es AM o PM.
	 */
	private int min;
	private int seg;
	private int horas;
	private boolean modo24;
	private boolean AM;

	
	//CONTRUCTOR VACIO
	public Reloj () {
		this.min=0;
		this.seg=0;
		this.horas=0;
		this.modo24=false;
		this.AM=false;
	}
	//CONTRUCTOR CON PARMETROS
	public Reloj (int horas, int min, int seg, boolean modo24, boolean AM) {
		
		this.modo24=modo24;
		this.AM=AM;
		if (this.comprobarHoras(horas, min, seg)) {
			this.min=min;
			this.seg=seg;
			this.horas=horas;	
		}
	}
	public boolean isModo24() {
		return modo24;
	}
	public void setModo24(boolean modo24) {
		this.modo24 = modo24;
	}
	public boolean isAM() {
		return AM;
	}
	public void setAM(boolean aM) {
		AM = aM;
	}
	public int getMin() {
		return min;
	}
	public void setMin(int min) {
		this.min = min;
	}
	public int getSeg() {
		return seg;
	}
	public void setSeg(int seg) {
		this.seg = seg;
	}
	public boolean getHoras(int horas) {
		boolean correcto=true;
		if (this.comprobarHoras(horas, this.horas, this.min)) {
			correcto=false;
		}
		return horas;
	}
	public void setHoras(int horas) {
		this.horas = horas;
	}
	
	public String toString() {
		String resultado="";
		if (this.modo24) {
			resultado = this.horas + ":" + this.min + ":" + this.seg;
		}else {
			resultado= this.horas + ":" + this.min + ":" + this.seg;
			if (this.AM) {
				resultado+= "AM";
			}else {
				resultado+="PM";
			}
		}
		return resultado; //QUE NO SE TE OLVIDE CRUCK
	}
	
	public boolean comprobarHoras(int horas, int min, int seg) {  //COMPROBAR 
		boolean correcto = true;
		if (horas<0 || min<0 || seg<0 || min>59 || horas>24 || seg>59) {
			correcto = false;
		}else {
			if (this.modo24 && horas>=24) {
				correcto=false;
			}else if (!this.modo24 && this.AM && horas>12) {
				correcto=false;
			}else if (!this.modo24 && this.AM && horas>=12) {
				correcto=false;
			}
		}
		return correcto;
	}	
	public void switchMode() {
		if (this.modo24) {
			this.horas= this.horas%12;
		}else {
			if (!this.AM) {
				this.horas+=12;
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
