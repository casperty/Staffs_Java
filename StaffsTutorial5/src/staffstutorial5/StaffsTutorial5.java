package staffstutorial5;

import static staffstutorial5.TestAssert.inputDouble;
import static staffstutorial5.TestAssert.inputInt;

/**
 *
 * @author Alexandre Ravaux
 */
public class StaffsTutorial5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //inputInt();
        //inputDouble();
        // asserts
        assert inputInt() < 5  : "the number entered should be lower than 5";
        assert inputInt() > 5  : "the number entered should be  greater than 5";
        assert inputDouble() < 5.0  : "the number entered should be  lower than 5.0";
    }
    
}
