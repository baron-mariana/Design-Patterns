package Clase;

public class FactoryPachetCazare implements Factory {

	@Override
	public PachetTuristic createPachet() {
		
		return new PachetCazare();
	}
	

}
