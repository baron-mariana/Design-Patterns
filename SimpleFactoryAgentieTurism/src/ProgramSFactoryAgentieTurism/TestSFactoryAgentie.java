package ProgramSFactoryAgentieTurism;

import clase.AgentieFactory;
import clase.AgentieSingletonFactory;
import clase.PachetTuristic;
import clase.TipPachet;

public class TestSFactoryAgentie {    //Clientul este programulMain

	public static void main(String[] args) {
		AgentieFactory agentieFactory = new AgentieFactory();
		PachetTuristic pachetTuristic = null;
		try {
			pachetTuristic = agentieFactory.createPachet(TipPachet.pachetCazare);//aici modific parametru in  fct de obiectul creat
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		pachetTuristic.descriere();
		
		//Apelul in cazul cand Agentia este si Singleton si Factory
		/*AgentieSingletonFactory agentieFabrica = AgentieSingletonFactory.getInstanta();
		try {
			pachetTuristic = agentieFactory.createPachet(TipPachet.pachetCazareSiTransport);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		pachetTuristic.descriere();
		*/
	}

}
