package seven.SecretAgents;

import java.util.Set;

public class Agent {
   private int id;

   private String name;

   private Address address;

   private String agency;
   


   private int age;
   
   private Set<Phone> phones;
   
   public Agent() {
		super();
	}
   
   public Agent(String name, Address address, String agency, int age,
		Set<Phone> phones) {
		this.name = name;
		this.address = address;
		this.agency = agency;
		this.age = age;
		this.phones = phones;
   }

   public Set<Phone> getPhones() {
	   return phones;
   }

	public void setPhones(Set<Phone> phones) {
		this.phones = phones;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return "Agent [id=" + id + ", name=" + name + ", address=" + address.toString()
				+ ", agency=" + agency + ", age=" + age + ", phones=" + phones.toString()
				+ "]";
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Address getaddress() {
		return address;
	}
	
	public void setaddress(Address address) {
		this.address = address;
	}
	
	public String getAgency() {
		return agency;
	}
	
	public void setAgency(String agency) {
		this.agency = agency;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
}