package seven.WebService;

import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebService;

import seven.SecretAgents.Agent;
import seven.SecretAgents.ManageAgents;

@Stateless
@WebService
public class Server {
	private ManageAgents MA;
	public Server(ManageAgents mA) {
		super();
		MA = mA;
	}
	@WebMethod
    public String setAgent(Agent agent) {
		MA.addAddress(agent.getaddress());
		MA.addAgent(agent);
		return "OK";
    }
	
	@WebMethod
    public String getAgents(String condition) {
        return MA.listAgents(condition);
    }
	
	
}
