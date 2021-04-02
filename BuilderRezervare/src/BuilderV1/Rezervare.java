package BuilderV1;

public class Rezervare {
private int codRezervare;
private boolean areMancareInclusa;
private boolean areScaunErgonomic;
private boolean areBauturaRacoritoare;
private boolean areMuzicaAmbientalaRersonalizata;
private String genMuzica;

public Rezervare(int codRezervare, boolean areMancareInclusa, boolean areScaunErgonomic, boolean areBauturaRacoritoare,
		boolean areMuzicaAmbientalaRersonalizata, String genMuzica) {
	super();
	this.codRezervare = codRezervare;
	this.areMancareInclusa = areMancareInclusa;
	this.areScaunErgonomic = areScaunErgonomic;
	this.areBauturaRacoritoare = areBauturaRacoritoare;
	this.areMuzicaAmbientalaRersonalizata = areMuzicaAmbientalaRersonalizata;
	this.genMuzica = genMuzica;
}

public void setCodRezervare(int codRezervare) {
	this.codRezervare = codRezervare;
}

public void setAreMancareInclusa(boolean areMancareInclusa) {
	this.areMancareInclusa = areMancareInclusa;
}

public void setAreScaunErgonomic(boolean areScaunErgonomic) {
	this.areScaunErgonomic = areScaunErgonomic;
}

public void setAreBauturaRacoritoare(boolean areBauturaRacoritoare) {
	this.areBauturaRacoritoare = areBauturaRacoritoare;
}

public void setAreMuzicaAmbientalaRersonalizata(boolean areMuzicaAmbientalaRersonalizata) {
	this.areMuzicaAmbientalaRersonalizata = areMuzicaAmbientalaRersonalizata;
}


public void setGenMuzica(String genMuzica) {
	this.genMuzica = genMuzica;
}
@Override
public String toString() {
	return "Rezervare [codRezervare=" + codRezervare + ", areMancareInclusa=" + areMancareInclusa
			+ ", areScaunErgonomic=" + areScaunErgonomic + ", areBauturaRacoritoare=" + areBauturaRacoritoare
			+ ", areMuzicaAmbientalaRersonalizata=" + areMuzicaAmbientalaRersonalizata + ", genMuzica=" + genMuzica
			+ "]";
}





}
