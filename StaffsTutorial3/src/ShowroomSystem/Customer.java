package ShowroomSystem;

/**
 *
 * @author alexandre
 */
public class Customer {
    private String name;
    private String email;
    private String phoneNumber;

    public Customer() {
        this.name = "Unknown";
        this.email = "No email";
        this.phoneNumber = "No phone number";
    }
    
    public Customer(String name) {
        this.name = name;
        this.email = "No email";
        this.phoneNumber = "No phone number";
    }

    public Customer(String name, String email, String telephone) {
        this.name = name;
        this.email = email;
        this.phoneNumber = telephone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return name + "\nemail: " + email + "\nPhone number: " + phoneNumber+"\n";
    }
    
    
    

}
