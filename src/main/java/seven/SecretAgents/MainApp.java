package seven.SecretAgents;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import seven.WebService.Server;

import javax.xml.ws.Endpoint;

public class MainApp {
	public static void main(String [] args) {
		ApplicationContext context = 
	             new ClassPathXmlApplicationContext("beans.xml");
		/*
	      Address address1 = (Address) context.getBean("address1");
	      Address address2 = (Address) context.getBean("address2");
	      Agent agent1 = (Agent) context.getBean("agent1");
		MA.addAddress(agent1.getaddress());
		MA.addAgent(agent1);
		*/	
		ManageAgents MA = (ManageAgents) context.getBean("MA");

	    //System.out.println(MA.listAgents("varsta<53"));
		Server SAws = new Server(MA);
		
		 Endpoint.publish("http://localhost:8094/agents", SAws);
	}
}
