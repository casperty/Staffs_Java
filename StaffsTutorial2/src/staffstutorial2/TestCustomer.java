package staffstutorial2;

import java.util.ArrayList;

/**
 *
 * @author Alexandre Ravaux
 */
public class TestCustomer {
    public static void main(String[] args) {
        // Instance of customer
        Customer c1=new Customer();
        Customer c2=new Customer("John Doe", "john.doe@gmail.com", "0689986798");
        System.out.println(c1);
        System.out.println(c2);     
        Vehicle v1=new Vehicle("Mini Cooper", "1", "1G1YZ23J9P5800001", "1-4-2012", 'A', 120000.0); 
        System.out.println("Age of vehicule 1 : "+v1.getAgeOfVehicle()+" week(s)\n");         
    }  
}
