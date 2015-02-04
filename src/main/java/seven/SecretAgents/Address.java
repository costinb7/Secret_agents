package seven.SecretAgents;

public class Address {
	private int id;
	
	private String city;
	
	private String country;

	public Address(String city, String country) {
		super();
		this.city = city;
		this.country = country;
	}

	public int getId() {
		return id;
	}

	public Address() {}

	public void setId(int id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
}
