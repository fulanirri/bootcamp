package ShoppingCart;

public class Client {

    private String mail;
    private int clientID;
    private String name;
    private String lastName;
    private String phonenumber;

    // Constructo

    public Client(String mail, int clientID, String name, String lastName,
            String phonenumber) {
        this.mail = mail;
        this.clientID = clientID;
        this.name = name;
        this.lastName = lastName;
        this.phonenumber = phonenumber;
    }

    // getters & setters

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public int getClientID() {
        return clientID;
    }

    public void setClientID(int clientID) {
        this.clientID = clientID;
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

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    // methods

    public String toString() {
        return "Name:" + name + " Last Name:" + lastName + " mail:" + mail
                + " ClientId:" + clientID + " Phone:" + phonenumber;
    }

}
