package Clase;

import java.util.ArrayList;               
import java.util.Random;                     //Prototype ne arata ca e mult mai usor sa copiezi decat sa generezi

public class Model3D implements Cloneable {  //punem implements cloneable
	
	String nume;
	String fisierModel;
	
	ArrayList<Integer> puncte;

	public Model3D(String nume, String fisierModel) {
		super();
		this.nume = nume;
		this.fisierModel = fisierModel;
		
		puncte = new ArrayList<>();
		System.out.println("Se incarca modelul 3D pentru" + nume);
		
		//intrerupem pentru doua secunde tredul care se incarca foarte greu
		
	//pt ca e foarte riscant facem try catch
		try {
			Thread.sleep(2000);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//generare date random
		
		//acesta este constructorul care simuleaza procesul costisitor
		Random random = new Random();
		for(int i = 0; i<random.nextInt(1000); i++) {//de la 0 la 1000
			//adaugam niste puncte
			puncte.add(random.nextInt(500));
			
		}
		
		System.out.println("Model incarcat");
		
	}
	
	//constructor privat sa nu poata fi accesat de altii
	
	private Model3D() {
		
		nume = " ";
		fisierModel = " ";
		puncte = null;
	}

	
	//source override clone
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		//Nu asa
		//Model3D  copie = new Model3D(this.nume, this.fisierModel);
		
		Model3D copie = new Model3D();
		copie.nume = this.nume;
		copie.fisierModel = this.fisierModel;
		copie.puncte = (ArrayList<Integer>) this.puncte.clone();//aici sa fim atenti sa facem cast si this.puncte
		
		return copie;
	}

	// set si get
	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public String getFisierModel() {
		return fisierModel;
	}

	public void setFisierModel(String fisierModel) {
		this.fisierModel = fisierModel;
	}

	
	
	

}
