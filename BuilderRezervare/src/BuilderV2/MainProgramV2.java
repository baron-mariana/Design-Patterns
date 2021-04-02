package BuilderV2;

public class MainProgramV2 {

	public static void main(String[] args) {
		RezervareBuilderV2 builder = new RezervareBuilderV2().setAreBauturaRacoritoare(true).setCodRezervare(125);
		Rezervare rezervare = builder.build();
		builder.setCodRezervare(256).setAreMancareInclusa(true);
		Rezervare rezervare2 = builder.build();
		System.out.println(rezervare.toString());
	    System.out.println(rezervare2.toString());}
	
	//putem face mai multi builderi...personalizam rezervarile

}
