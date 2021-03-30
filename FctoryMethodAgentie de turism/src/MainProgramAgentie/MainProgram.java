package MainProgramAgentie;

import Clase.Factory;
import Clase.FactoryPachetAllInclusive;
import Clase.PachetTuristic;

public class MainProgram {
	
	private static void afisare( Factory fabrica) {
		
		PachetTuristic pachetTuristic = fabrica.createPachet();
		pachetTuristic.descriere();
	}
	
	public static void main(String[] args) {
		afisare(new FactoryPachetAllInclusive());
	}

}
