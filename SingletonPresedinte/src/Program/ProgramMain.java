package Program;

import Clase.Presedinte;

public class ProgramMain {
	
	public static void main(String[] args) {
		
		Presedinte presedinte1= Presedinte.getInstance();
		Presedinte presedinte2 = Presedinte.getInstance();

		System.out.println(presedinte1.toString());
		System.out.println(presedinte2.toString());
		
		presedinte1.toString();
		presedinte2.toString();
		presedinte1.toString();
		
		
	}

}
