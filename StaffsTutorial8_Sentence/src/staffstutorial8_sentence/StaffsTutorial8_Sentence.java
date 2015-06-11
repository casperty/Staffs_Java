package staffstutorial8_sentence;

/**
 *
 * @author Alexandre Ravaux
 */
public class StaffsTutorial8_Sentence {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StringBuilder s1 = new StringBuilder("Margaret Thatcher");
        System.out.println(s1);
        s1.replace(13, 14, " great ");
        s1.replace(0, 9, "");
        s1.replace(10, 11," c");
        s1.replace(13, 14,"a");
        s1.append("mer");
        System.out.println(s1);
    }
    
}
