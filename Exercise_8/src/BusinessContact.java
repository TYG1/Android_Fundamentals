/**
 * Created by George on 5/7/16.
 */
public class BusinessContact extends Contact {

    private String name;
    private String email;
    String phoneNumber;

    public BusinessContact(String name, String email, String phoneNumber) {
        super(name, email);
        phoneNumber = phoneNumber;
    }

    public void contactInfo() {
        super.contactInfo();
        System.out.println("Phone Number: " + this.phoneNumber);
    }

}
