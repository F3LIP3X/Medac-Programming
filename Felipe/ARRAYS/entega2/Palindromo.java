package entega2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Palindromo {
	 private ArrayList<Character> palindromo;
	 
	 public Palindromo() {
		 this.palindromo = new ArrayList<Character>();
	 }
	 
	 public ArrayList<Character> getPalindramo(){
		 return palindromo;
	 }
	 
	 public void getPalindromo(ArrayList<Character>palindromo) {
		 this.palindromo = palindromo;
	 }
	 
	 public void añadirLetra(char letra) {
		 this.palindromo.add(letra);
	 }
	 
	 public boolean isPalindromo() {
		 ArrayList<Character> aux = new ArrayList<Character>();
		 aux.addAll(this.palindromo);
		 return aux.equals(this.palindromo);
		 
	 }
	 
	 public String toString() {
		 String resultado="";
		 for(int i=0;i<this.palindromo.size();i++) {
			 resultado+=this.palindromo.get(i);
		 }
		 return resultado;
	 }
}
