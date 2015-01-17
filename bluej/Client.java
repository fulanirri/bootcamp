 

public class Client {

	private String mail;
	private int userId;
	private String name;
	private String lastName;
	private String phoneNumber;

	// Constructor

	public Client(String mail, int userId, String name, String lastName, String phoneNumber) {
		this.mail = mail;
		this.userId = userId;
		this.name = name;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
	}

	// Getters & Setters

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}
