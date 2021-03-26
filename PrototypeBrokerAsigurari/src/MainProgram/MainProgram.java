package MainProgram;

import Clase.AsigurareAuto;
import Clase.ContractAsigurare;
import Clase.PrototypeFctory;

public class MainProgram {

	public static void main(String[] args) {
		
		AsigurareAuto asigurare1 = new AsigurareAuto();
		asigurare1.setId("1");
		System.out.println("asigurare1");
		
		AsigurareAuto asigurare2 = new AsigurareAuto();
		asigurare2.setId("2");
		System.out.println("asigurare2");
		

		ContractAsigurare asigurare3 = PrototypeFctory.getPrototip("Auto");
		if(asigurare3 != null);
		System.out.println("asigurare3");
		
		ContractAsigurare asigurare4 = PrototypeFctory.getPrototip("Auto");
		if(asigurare4 != null);
		System.out.println("asigurare4");
		
		ContractAsigurare asigurare5 = PrototypeFctory.getPrototip("Locuita");
		if(asigurare5 != null);
		System.out.println("asigurare5");
		
		//testare shallow-copy fara Prototype
		/*if(asigurare1.getClauzeContractuale() == asigurare2.getClauzeContractuale());
		System.out.println("\nAceleiasi clauze contractuale");*/
		
		//testare shallw-copy cu Prototype
		if(asigurare3.getClauzeContractuale() == asigurare4.getClauzeContractuale());
		System.out.println("\nAceleiasi clauze contractuale auto");
		
		
	}

}
