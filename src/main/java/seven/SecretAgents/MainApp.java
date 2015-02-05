package seven.SecretAgents;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String [] args) {
		ApplicationContext context = 
	             new ClassPathXmlApplicationContext("beans.xml");
		/*
	      Address address1 = (Address) context.getBean("address1");
	      Address address2 = (Address) context.getBean("address2");
	      Agent agent1 = (Agent) context.getBean("agent1");
	      */
		ManageAgents MA = (ManageAgents) context.getBean("MA");
	    MA.listAgents("varsta<53");
	}
}
