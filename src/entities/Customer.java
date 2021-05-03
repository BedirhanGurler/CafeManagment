package entities;

public class Customer {
	private int id;
	private String firstName;
	private String lastName;
	private String nationalitylId;
	private int birthOfYeear;
	
	public Customer(int id, String firstName, String lastName, String nationalitylId, int birthOfYeear) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationalitylId = nationalitylId;
		this.birthOfYeear = birthOfYeear;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getNationalitylId() {
		return nationalitylId;
	}

	public void setNationalitylId(String nationalitylId) {
		this.nationalitylId = nationalitylId;
	}

	public int getBirthOfYeear() {
		return birthOfYeear;
	}

	public void setBirthOfYeear(int birthOfYeear) {
		this.birthOfYeear = birthOfYeear;
	}
}
