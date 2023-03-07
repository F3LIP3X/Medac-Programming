package cubo;

public class clase {
	
	//Una clase para representar trinagulos rectangulos. metodos especificos perimetros y area
	
	private double base;
	private double altura;
	private double hipotenusa;
	
	//constructor vacio
	public clase () {
		this.base=1;
		this.altura=1;	
		this.hipotenusa=2;
	}
	
	//constructor con parametro
	public clase(double base,double altura,double hipotenusa) {	
		this.base=base;
		this.altura=altura;
		this.hipotenusa=hipotenusa;
		
	}
	//constructor con parametro
	public clase(double base,double altura) {	
		this.base=base;
		this.altura=altura;
		this.hipotenusa=Math.sqrt(Math.pow(base, 2)+Math.pow(altura, base));
		
	}

	public double getBase() {
		return this.base;	
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return this.altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getHipotenusa() {
		return this.hipotenusa;
	}

	public void setHipotenusa(double hipotenusa) {
		this.hipotenusa = hipotenusa;
	}
	
	public double Perimetro() {
		return (this.base + this.altura);
	}
	
	public double Area() {
		return (this.base * this.altura);
	}
	
	
}
