package BuilderV2;          //rezervare si abstractBuilder la fel

import BuilderV1.RezervareBuilder;

public class RezervareBuilderV2 implements AbstractBuilder {//implements ptr varianta asta
	private int codRezervare;
	private boolean areMancareInclusa;
	private boolean areScaunErgonomic;
	private boolean areBauturaRacoritoare;
	private boolean areMuzicaAmbientalaRersonalizata;
	private String genMuzica;
	
	public RezervareBuilderV2 setCodRezervare(int codRezervare) {
		this.codRezervare = codRezervare;
		return this;
	}

	public RezervareBuilderV2 setAreMancareInclusa(boolean areMancareInclusa) {
		this.areMancareInclusa = areMancareInclusa;
		return this;
	}

	public  RezervareBuilderV2 setAreScaunErgonomic(boolean areScaunErgonomic) {
		this.areScaunErgonomic = areScaunErgonomic;
		return this;
	}

	public RezervareBuilderV2 setAreBauturaRacoritoare(boolean areBauturaRacoritoare) {
		this.areBauturaRacoritoare = areBauturaRacoritoare;
		return this;
	}

	public RezervareBuilderV2 setAreMuzicaAmbientalaRersonalizata(boolean areMuzicaAmbientalaRersonalizata) {
		this.areMuzicaAmbientalaRersonalizata = areMuzicaAmbientalaRersonalizata;
		return this;
	}


	public void setGenMuzica(String genMuzica) {
		this.genMuzica = genMuzica;
	}

	@Override
	public Rezervare build() {
		Rezervare rezervare = new Rezervare(codRezervare, areBauturaRacoritoare, areBauturaRacoritoare, areMancareInclusa, areMuzicaAmbientalaRersonalizata, genMuzica);
		return rezervare;
	}

}
