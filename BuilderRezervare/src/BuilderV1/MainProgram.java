package BuilderV1;

public class MainProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rezervare rezervare= new RezervareBuilder().setAreBauturaRacoritoare(true).setCodRezervare(100).build();
		Rezervare rezervare2= new RezervareBuilder().setAreMancareInclusa(true).setCodRezervare(133).setAreMuzicaAmbientalaRersonalizata(true).build();
        System.out.println(rezervare.toString());
        System.out.println(rezervare2.toString());
        
        
        //shallow copy
        RezervareBuilder builder = new RezervareBuilder().setAreBauturaRacoritoare(true);
        Rezervare rezervare3 = builder.build();
        Rezervare rezervare4= builder.setCodRezervare(123).build();
        rezervare3.setCodRezervare(233);
        System.out.println(rezervare3.toString());
        System.out.println(rezervare4.toString());
	}
	
	

}
