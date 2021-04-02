package BuilderV1;

public class RezervareBuilder implements AbstractBuilder{

	private Rezervare rezervare;
	
	public RezervareBuilder() {//ai e mereu public nu confund cu private de la singleton
		rezervare = new Rezervare(0, false, false, false, false, "rogk");
	}

	@Override
	public Rezervare build() {
		
		return rezervare;
	}

	
	
	
	
	//setarii mai speciali pt builder fara rezervare void
	
	public RezervareBuilder setCodRezervare(int codRezervare) {
		rezervare.setCodRezervare(codRezervare);
		return this;
	}

	public RezervareBuilder setAreMancareInclusa(boolean areMancareInclusa) {
		rezervare.setAreMancareInclusa(areMancareInclusa);;
		return this;
	}

	public RezervareBuilder setAreScaunErgonomic(boolean areScaunErgonomic) {
		rezervare.setAreScaunErgonomic(areScaunErgonomic);
		return this;
	}

	public RezervareBuilder setAreBauturaRacoritoare(boolean areBauturaRacoritoare) {
		rezervare.setAreBauturaRacoritoare(areBauturaRacoritoare);
		return this;
	}

	public RezervareBuilder setAreMuzicaAmbientalaRersonalizata(boolean areMuzicaAmbientalaRersonalizata) {
		rezervare.setAreMuzicaAmbientalaRersonalizata(areMuzicaAmbientalaRersonalizata);
		return this;
	}


	public RezervareBuilder setGenMuzica(String genMuzica) {
		rezervare.setGenMuzica(genMuzica);
		return this;
	}
	
}
