package MainProgram;

import Clase.Model3D;

public class TestClientJoc {

	public static void main(String[] args) {
		
		//fara prototype
		/*
		Model3D  soldat2 = new Model3D("Solda2", "Soda.3D");
		Model3D  soldat3 = new Model3D("Solda3", "Soda.3D");
		Model3D  soldat4 = new Model3D("Solda4", "Soda.3D");*/
		
		//cu prototype
		
		Model3D  soldat = new Model3D("Solda", "Soda.3D");//generic
		
		Model3D  soldat1=  (Model3D) soldat.clone();
		soldat.setNume("Soldat 1");
		Model3D  soldat2=  (Model3D) soldat.clone();
		soldat.setNume("Soldat 2");
		Model3D  soldat3=  (Model3D) soldat.clone();
		soldat.setNume("Soldat 3");
	}

}
