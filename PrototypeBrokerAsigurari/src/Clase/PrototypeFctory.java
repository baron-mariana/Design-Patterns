package Clase;
                              //Stocam intr-un hashMap lista prototipurilor contractelor de asigurare existente
                              //avand o componenta statica prin care se incarca prototipurile contractelor de asigurare
import java.util.HashMap;

public class PrototypeFctory {
	
	private static HashMap <String, ContractAsigurare> prototipuriContracte = new HashMap<>();
	
	static {
		//incarcare prototipuri contracte de asigurare
		
		System.out.println("Initializare contracte de asigurare");
		
		AsigurareAuto asigurareAuto = new AsigurareAuto();
		asigurareAuto.setId("Auto");
		prototipuriContracte.put("Auto",asigurareAuto);
		
		AsigurareLocuinte asigurareLocuinte = new AsigurareLocuinte();
		asigurareLocuinte.setId("Locuinta");
		prototipuriContracte.put("Locuinta",asigurareLocuinte);
		System.out.println("\n");
	}

	public static ContractAsigurare getPrototip(String id) {
		
		ContractAsigurare copiePrototip = null;
		ContractAsigurare prototip = prototipuriContracte.get(id);
		
		if( prototip != null)
			copiePrototip = (ContractAsigurare) prototip.clone();
		
		return copiePrototip;
	}
}
