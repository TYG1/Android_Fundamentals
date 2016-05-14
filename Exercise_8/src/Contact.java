/**
 * Created by George on 5/7/16.
 */
public class Contact {

    private String name;
    private String email;

    public Contact(String name, String email){
        name = name;
        email = email;
    }

    public void contactInfo(){
        System.out.println("Name: " + this.name);
        System.out.println("Email: " + this.email);
    }

}

