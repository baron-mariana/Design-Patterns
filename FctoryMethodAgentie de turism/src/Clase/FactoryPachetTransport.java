package Clase;

public class FactoryPachetTransport implements Factory {

	@Override
	public PachetTuristic createPachet() {
		
		return new PachetTransport();
	}
	

}
