package Test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import staffstutorial5.junit.DVD;
import staffstutorial5.junit.Person;
import static org.junit.Assert.*;

/**
 *
 * @author Alexandre Ravaux
 */
public class DVDTest {
    Person actor;
    DVD d1;
    
    public DVDTest() {
    }
        
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        actor=new Person("Leonardo","DiCaprio");
        d1=new DVD("Inception", actor, 5);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getTitle method, of class DVD.
     */
    @Test
    public void testGetTitle() {
        System.out.println("getTitle");
        String expResult = "Inception";
        String result = d1.getTitle();
        assertEquals(expResult, result);
    }

    /**
     * Test of setTitle method, of class DVD.
     */
    @Test
    public void testSetTitle() {
        System.out.println("setTitle");
        String expResult = "The Departed";
        String title = "The Departed";
        d1.setTitle(title);
        assertEquals(expResult, d1.getTitle());
    }

    /**
     * Test of getLeadActor method, of class DVD.
     */
    @Test
    public void testGetLeadActor() {
        Person leadActor = d1.getLeadActor();
        assertEquals("Leonardo DiCaprio", leadActor.toString());
    }

    /**
     * Test of setLeadActor method, of class DVD.
     */
    @Test
    public void testSetLeadActor() {
        System.out.println("setLeadActor");
        Person leadActor = new Person("Michael", "Caine");
        d1.setLeadActor(leadActor);
        assertEquals("Michael Caine", d1.getLeadActor().toString());

    }

    /**
     * Test of getNoOfStars method, of class DVD.
     */
    @Test
    public void testGetNoOfStars() {
        System.out.println("getNoOfStars");
        int expResult = 5;
        int result = d1.getNoOfStars();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNoOfStars method, of class DVD.
     */
    @Test
    public void testSetNoOfStars() {
        System.out.println("setNoOfStars");
        int noOfStars = 0;
        d1.setNoOfStars(noOfStars);
        assertEquals(noOfStars, d1.getNoOfStars());
    }

    /**
     * Test of toString method, of class DVD.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        String expResult = "Inception Leonardo DiCaprio 5\n";
        String result = d1.toString();
        assertEquals(expResult, result);
    }
    
}
