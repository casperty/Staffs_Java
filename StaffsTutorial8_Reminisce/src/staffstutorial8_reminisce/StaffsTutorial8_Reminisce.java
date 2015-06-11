package staffstutorial8_reminisce;

/**
 *
 * @author Alexandre Ravaux
 */
public class StaffsTutorial8_Reminisce {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StringBuilder s1 = new StringBuilder("reminisce");
        System.out.println(s1);
        s1.replace(1, 2, "o"); // rominisce
        s1.replace(3,4, "a"); // romanisce
        s1.replace(5,8,"esqu"); //romanesque
        System.out.println(s1);
    }
    
}
