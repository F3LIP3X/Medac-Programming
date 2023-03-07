package entrega;

import java.util.ArrayList;

public class Boleto {
	private ArrayList<Integer> boleto;
	
	public Boleto() {
		this.boleto = new ArrayList<Integer>();
	}
	
	public ArrayList<Integer> getBoleto(){
		return boleto = boleto;
	}
	
	public void setBoleto(ArrayList<Integer> boleto){
		this.boleto = boleto;
	}
	
	public String toString() {
		return this.boleto.toString();
	}
	
	public void añadirNumero(int num) {
		this.boleto.add(num);
	}
	
	public int comparar(Boleto b1) {
		int aciertos = 0 ;
		for(int i=0;i<this.boleto.size();i++) {
			if(this.boleto.get(i).equals(b1.getBoleto().get(i))) {
				aciertos++;
			}
		}
		return aciertos;
	}
}
