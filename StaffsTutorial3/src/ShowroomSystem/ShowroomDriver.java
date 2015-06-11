package ShowroomSystem;

import java.util.ArrayList;

/**
 *
 * @author Alexandre Ravaux
 */
public class ShowroomDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Instance of 4 vehicles */      
        /* The VIN are wrong, but it is just for the demo */
        Vehicle v1=new Vehicle("Mini Cooper", "1", "1G1YZ23J9P5800001", "1-4-2015", 'A', 120000.0);
        Vehicle v2=new Vehicle("Peugeot", "1", "19UYA2242VL017854", "1-4-2012", 'C', 118000.0);
        Vehicle v3=new Vehicle("Aston Martin", "1", "1G1YZ23J9P5800002", "1-4-2012", 'A', 1200000.0);
        Vehicle v4=new Vehicle("Fiat", "1", "19UYA2242VL017857", "30-3-2015", 'C', 118000.0);
        System.out.println(v1);
        System.out.println(v2);
        
        /* Instance of showroom */
        ArrayList<Vehicle> list = new ArrayList<Vehicle>();
        list.add(v1);
        list.add(v2);
        list.add(v3);
        list.add(v4);
        Showroom sh=new Showroom(list);
        System.out.println(sh);
        
        /* Search method */
        sh.findVehicle("1G1YZ23J9P5800001");
        System.out.println();
        
        /* Buying method */
        v3.buy(new Customer("James Bond"));
        v1.buy(new Customer("Mr. Bean"));
        System.out.println(sh);
        /* Vehicles sold within 2 weeks */
        System.out.println(sh.getVehiclesSoldRecently());
        
        GuiShowroom d = new GuiShowroom(sh);
        
        
    }
    
}
