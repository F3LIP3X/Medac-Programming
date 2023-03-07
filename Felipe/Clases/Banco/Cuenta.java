package Banco;

public class Cuenta {

	private String Titular;
	private double Saldo;
	
	//constructor vacio//
		public Cuenta () {
			this.Titular="";
			this.Saldo=0;
		}		
	//constructor con parametros//
			
		public Cuenta(double Saldo,String Titular) {	
			this.Saldo=Saldo;
			this.Titular=Titular;
				
		}
		
	//constructor sin saldo//
		public Cuenta(String Titular) {
			this.Titular=Titular;
			this.Saldo=0;
		}

		
		public String getTitular() {
			return this.Titular;
		}

		public void setTitular(String titular) {
			this.Titular = titular;
		}

		public double getSaldo() {
			return this.Saldo;
		}

		public void setSaldo(double saldo) {
			this.Saldo = saldo;
		}

		
		@Override
		public String toString() {
			return "El Titular es =" + Titular + ", y tiene un Saldo de =" + Saldo;
		}

		//funciones especiales
		public boolean Ingresar(double dinero) {
			boolean correcto=true;
			if (dinero>0) {
				this.Saldo+=dinero;	
			}else {
				correcto=false;
			}
			return correcto;
		}
		
		public boolean Retirar(double dinero) {
			boolean correcto=true;
			if (this.Saldo-dinero<0) {
				correcto=false;
			}else {
				this.Saldo-=dinero;
			}
			return correcto=false;
		}
		public boolean Transferir(double dinero, Cuenta Cuenta2) {
		boolean correcto =this.Retirar(dinero);
		if (correcto) {
			Cuenta2.Ingresar(dinero);
		}
		return correcto;
}
}