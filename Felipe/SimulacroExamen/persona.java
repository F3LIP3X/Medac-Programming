public class persona {
	private double peso;
	private double altura;
	private double imc;
	private int edad;
	private boolean sexo;
	private String DNI;
	
	
	//CONSTRUCTOR VACIO
	public persona() {
		this.peso=0;
		this.altura=0;
		this.imc=0;
		this.edad=0;
		this.sexo=false;
		this.DNI="";  
	}
	//CONSTRUCTOR CON PARAMETROS
	public persona(int peso, int altura, double imc, int edad, boolean sexo, String DNI) {
		this.peso=peso;
		this.altura=altura;
		this.imc=imc;
		this.edad=edad;
		this.sexo=sexo;
		this.DNI=DNI;
	}
	//setters and getters
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double getImc() {
		return imc;
	}
	public void setImc(double imc) {
		this.imc = imc;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public boolean getSexo() {
		return sexo;
	}
	public void setSexo(boolean sexo) {
		this.sexo = sexo;
	}
	public String getDNI() {
		return DNI;
	}
	public void setDNI(String dNI) {
		DNI = dNI;
	}
	
	
	//METODOS ESPECIALES
	public void calcularIMC() {
		imc=this.peso/(this.altura*2);
	}
	public String CalificacionOMS() {
		String resultado="";
		if (imc<18.5) {
			resultado=("Clasificación de la OMS: Bajo peso" + "Descripción popular: Delgado");
		}else if (imc>=18.5 || imc<=24.9) {
			resultado=("Clasificación de la OMS: Peso adecuado" + "Descripción popular: Aceptable");
		}else if (imc>=25.0 || imc<=29.9) {
			resultado=("Clasificación de la OMS: Sobre peso" + "Descripción popular: Todos somos perfectos mientras no afecte a nuestra salud :3");
		}else if (imc>=30.0 || imc<=34.9) {
			resultado=("Clasificación de la OMS: Obesidad grado 1" + "Descripción popular: Obesidad");
		}else if (imc>=35.0 || imc<=39.9) {
			resultado=("Clasificación de la OMS: Obesidad grado 2" + "Descripción popular: Obesidad");
		}else {
			resultado=("Clasificación de la OMS: Obesidad grado 3" + "Descripción popular: Obesidad");
		}
		return resultado;
	}
	//MAYOR O MENOR DE EDAD
	public boolean Edad() {
		boolean mayor=true;
		if (this.edad<18) {
			mayor=false;
		}
		return mayor;
	}
	//SEXO M o F
	public boolean Sexo(boolean sexo2) {
		boolean sexo = true;
		if (this.sexo==sexo2) {
		
		}
		return sexo;
	}
	
	private void generarDNI() {
        final int divisor = 23;

        //GENERAR NUMERO 8 DIGITOS
        int numDNI = ((int) Math.floor(Math.random() * (100000000 - 10000000) + 10000000));
        int res = numDNI - (numDNI / divisor * divisor);

        //PARA COMPROBAR LA LETRA DEL DNI
        char letraDNI = generaLetraDNI(res);

        //PASAMOS TODO EL CONJUNTO A STRING
        DNI = Integer.toString(numDNI) + letraDNI;
    }

    private char generaLetraDNI(int res) {
        char letras[] = {'T', 'R', 'W', 'A', 'G', 'M', 'Y',
            'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z',
            'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

        return letras[res];
		
	}
}
