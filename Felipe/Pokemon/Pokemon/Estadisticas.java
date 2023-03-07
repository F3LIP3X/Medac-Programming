package Pokemon;

public class Estadisticas {
	private int ps;
	private int ataque;
	private int ataqueespecial;
	private int def;
	private int defespecial;
	private int vel;
	
	public Estadisticas(int ps, int ataque, int ataqueespecial, int def, int defespecial, int vel) {
		super();
		this.ps = ps;
		this.ataque = ataque;
		this.ataqueespecial = ataqueespecial;
		this.def = def;
		this.defespecial = defespecial;
		this.vel = vel;
	}

	public int getPs() {
		return ps;
	}

	public void setPs(int ps) {
		this.ps = ps;
	}

	public int getAtaque() {
		return ataque;
	}

	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}

	public int getAtaqueespecial() {
		return ataqueespecial;
	}

	public void setAtaqueespecial(int ataqueespecial) {
		this.ataqueespecial = ataqueespecial;
	}

	public int getDef() {
		return def;
	}

	public void setDef(int def) {
		this.def = def;
	}

	public int getDefespecial() {
		return defespecial;
	}

	public void setDefespecial(int defespecial) {
		this.defespecial = defespecial;
	}

	public int getVel() {
		return vel;
	}

	public void setVel(int vel) {
		this.vel = vel;
	}
	
	
	
}
