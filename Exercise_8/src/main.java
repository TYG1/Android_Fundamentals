/**
 * Created by George on 5/7/16.
 */
public class main {
    public static void main(String []args){
        Contact Person = new Contact("George", "george@hotmail.com");

        Person.contactInfo();


        BusinessContact business = new BusinessContact("BestBuy", "support@bestbuy.com", "6145557777");

        business.contactInfo();
    }
}
