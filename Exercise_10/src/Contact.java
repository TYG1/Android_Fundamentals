/**
 * Created by George on 5/8/16.
 */
abstract class Contact {

    public String name;

    public Contact(String name){
        this.name = name;
    }

    public abstract void display();

}

class EmailContact extends Contact{
    private String email;

    public EmailContact(String name, String email){
        super(name);
        this.email = email;
    }

    @Override
    public void display() {
        System.out.println("Emailing Faculty: " + this.name);
        System.out.println("Emailing ...(" + this.email + ")");
        System.out.println("");
    }
}

class VoiceContact extends Contact {
    private String phone;

    public VoiceContact(String name, String phoneNumber) {
        super(name);
        this.phone = phoneNumber;
    }

    @Override
    public void display() {
        System.out.println("Calling VoiceContact: " + this.name);
        System.out.println("Calling ...(" + this.phone + ")");
        System.out.println("");
    }



    public static void main(String[] args) {

         EmailContact person1 = new  EmailContact("Chad", "Chad123@cscc.edu");
        person1.display();

        VoiceContact person2 = new VoiceContact("Bob", "614-123-1234");
        person2.display();

    }

}