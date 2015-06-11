package staffstutorial8_obdurate;

/**
 *
 * @author Alexandre Ravaux
 */
public class StaffsTutorial8_Obdurate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s1 = "obdurate";
        System.out.println(s1);
        s1 = s1.replaceFirst("e", "ion");
        s1 = s1.replaceFirst("du", "lite");
        System.out.println(s1);
    }
    
}
