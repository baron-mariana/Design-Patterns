package Clase;

import java.util.ArrayList;

public class AsigurareLocuinte extends ContractAsigurare {

	public AsigurareLocuinte() {
		System.out.println("Incarcare contract de asigurare locuinte");
		clauzeContractuale = new ArrayList<>(5);
		this.tip = "Asigurare Locuinte";
		
	}

	@Override
	void printare() {
		
		System.out.println("Contract de tip" +this.tip);
		
	}

}
