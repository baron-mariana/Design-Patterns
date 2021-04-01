package Program;

import Clase.IListaOferte;
import Clase.ListaOferte;

public class MainProgram {

	public static void main(String[]args) throws CloneNotSupportedException {
		IListaOferte listaOferte = new ListaOferte();
		listaOferte.incarcaListaOferte();
		
		IListaOferte copieListaOferte = null;
		copieListaOferte = listaOferte.copiaza();
		System.out.println(copieListaOferte.toString());
	}
}
