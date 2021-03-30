package Clase;

public class FactoryPachetCazareTransport implements Factory {

	@Override
	public PachetTuristic createPachet() {
		
		return new PachetCazareTransport();
	}
	

}
