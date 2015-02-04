package seven.SecretAgents;

public class Phone {
	private int id;
	
	private String number;
	
	private String network;
	
	public Phone(String number, String network) {
		super();
		this.number = number;
		this.network = network;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getNetwork() {
		return network;
	}

	public void setNetwork(String network) {
		this.network = network;
	}

	
	public Phone() {}
}
