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
        
        Electric e1=new Electric("Mini Cooper", "1", "1G1YZ23J9P5800001", "1-4-2015", 'A', 120000.0,1,"ElectricTest");
        Vehicle h1=new Hybrid("Volkswagen", "1", "19UYA2242VL017854", "1-4-2012", 'C', 118000.0, 1000.0, "DriveTest");
        Vehicle ic1=new InternalCombustion("Mercedes", "1", "19UYA2242VL017854", "1-4-2012", 'C', 118000.0, 1000.0);
        System.out.println("DISPLAY SOME VEHICLES:");
        System.out.println(e1);
        System.out.println(h1);
        System.out.println(ic1);
        
        ArrayList<Vehicle> list = new ArrayList<Vehicle>();
        list.add(e1);
        list.add(h1);
        list.add(ic1);
        Showroom sh=new Showroom(list);
        System.out.println("");
        System.out.println(sh);
        sh.delete();
        System.out.println("DELETE CURRENT VEHICLE ");
        System.out.println(sh);
        sh.applyPromo();
        System.out.println("APPLYING PROMO :");
        System.out.println(sh);        
        
        GuiShowroom d = new GuiShowroom(sh);
        
    }
    
}
