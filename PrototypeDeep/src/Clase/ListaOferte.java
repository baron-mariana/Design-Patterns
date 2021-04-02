package Clase;
// daca se specifica ca trecuie ulterior sa modificam lista folosim deep
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ListaOferte implements IListaOferte  {
	
	
	private List<String>oferte;
	public ListaOferte() {  oferte = new ArrayList<String>();
	}

	
	public void incarcaListaOferte() {
		try {
			BufferedReader reader = new BufferedReader(new FileReader("oferte.txt"));
		String oferta = null;
		while((oferta= reader.readLine())!= null) {
			oferte.add(oferta);
			
		}
	} catch(FileNotFoundException e) {
		e.printStackTrace();
	}catch(IOException e) {
		e.printStackTrace();
	}
		
	}
	
	public IListaOferte copiaza() {
		ListaOferte listaOferte = new ListaOferte();
		List<String> listaTemporara = new ArrayList<>();
		for(String oferta:this.oferte) {
			listaTemporara.add(oferta);
		
		}
		listaOferte.setOferte(listaTemporara);
		return listaOferte;
	}
	
	



	private void setOferte(List<String> listaTemporara) {
		
	}


	@Override
	public String toString() {
		
		{return "ListaOferte[oferte=" + "]";}
		
	}


	
	

}
