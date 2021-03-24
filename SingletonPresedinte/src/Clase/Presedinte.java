package Clase;

public class Presedinte {

	private String nume;
	private int varsta;
	private int mandat;
	
	
	private Presedinte() {//trebuie sa fie privat..putem folosi doar un constructor ptr Singleton
		this.nume = "Sandu";
		this.varsta = 69;
		this.mandat  = 4;
		
	}

private Presedinte(String nume, int varsta, int mandat) {//trebuie sa fie privat
		super();
		this.nume = nume;
		this.varsta = varsta;
		this.mandat = mandat;
	}
	
	private static Presedinte instance = new Presedinte();// la eager initialization
	
	public static Presedinte getInstance() {
		
		return instance;
	}

	@Override
	public String toString() {
		return "Presedinte [nume=" + nume + ", varsta=" + varsta + ", mandat=" + mandat + "]";
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public int getVarsta() {
		return varsta;
	}

	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}

	public int getMandat() {
		return mandat;
	}

	public void setMandat(int mandat) {
		this.mandat = mandat;
	}

	public static void setInstance(Presedinte instance) {
		Presedinte.instance = instance;
	}

	
}
