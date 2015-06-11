package Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;
import org.junit.Before;
import org.junit.Test;
import staffstutorial6.DVD;
import staffstutorial6.DVDComparator;
import staffstutorial6.Person;

/**
 *
 * @author Alexandre Ravaux
 */
public class DVDCollectionTest {
    private ArrayList<DVD> theDVDs;
    private Person p1,p2,p3,p4;
    private String tableau [] = new String[5];
    public DVDCollectionTest() {
        
    }   
    
    @Before
    public void setUp() {
        p1=new Person("Leonardo","DiCaprio");
        p2=new Person("Fay","Wray");
        p3=new Person("Naomi","Watts");
        p4=new Person("Cary","Grant");
        theDVDs=new ArrayList<DVD>();
        theDVDs.add(new DVD("Inception",p1,5));
        theDVDs.add(new DVD("King Kong",p2,5));
        theDVDs.add(new DVD("King Kong",p3,4));
        theDVDs.add(new DVD("Indiscreet",p4,3));
        theDVDs.add(new DVD("Ellie Parker",p3,4));
        
        tableau[0]="Inception Leonardo DiCaprio 5\n";
        tableau[1]="King Kong Fay Wray 5\n";
        tableau[2]="King Kong Naomi Watts 4\n";
        tableau[3] = "Indiscreet Cary Grant 3\n";
        tableau[4] = "Ellie Parker Naomi Watts 4\n";
 
    }

    @Test
    public void testArrayListFilling() {
        System.out.println("testArrayListFilling");
        int i=0;
        Iterator itr = theDVDs.iterator();
        while(itr.hasNext()) {
            Object element = itr.next();
            assertEquals(tableau[i], element.toString());
            i++;
        }
    }
    @Test
    public void testShuffle(){
        System.out.println("testShuffle");
        Collections.shuffle(theDVDs);
        //assertNotSame(tableau[0], theDVDs.get(0));
        int i=0;
        Iterator itr = theDVDs.iterator();
        while(itr.hasNext()) {
            Object element = itr.next();
            assertNotSame(tableau[i], element.toString());
            i++;
        }
    }
    
    @Test
    public void testSort(){
        System.out.println("testSort");
        Collections.sort(theDVDs);
        System.out.println(theDVDs);
        assertEquals("Ellie Parker Naomi Watts 4\n", theDVDs.get(0).toString());
    }
    
    @Test
    public void testSortByStars(){
        System.out.println("testSortByStars");
        DVDComparator dvdCmp=new DVDComparator();
        
        // Sorting by stars the list
        Collections.sort(theDVDs, dvdCmp);
        
        System.out.println(theDVDs);

        assertEquals("Indiscreet Cary Grant 3\n",theDVDs.get(0).toString());
        assertNotSame("Ellie Parker Naomi Watts 4\n", theDVDs.get(0).toString());
    }
}
