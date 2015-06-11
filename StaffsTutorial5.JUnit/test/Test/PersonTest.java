package Test;

import org.junit.Before;
import org.junit.Test;
import staffstutorial5.junit.Person;
import static org.junit.Assert.*;

/**
 *
 * @author Alexandre Ravaux
 */
public class PersonTest {
    Person p1,p2;
    public PersonTest() {
    }
    /**
     * Create two persons
     */
    @Before
    public void before(){
        p1=new Person("Manuel Kevin", "Lopes");
        p2=new Person();
    }

    /**
     * Test of getFirstName method, of class Person.
     */
    @Test
    public void testGetFirstName() {
        System.out.println("getFirstName");   
        String expResult = "Manuel Kevin";
        String result = p1.getFirstName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setFirstName method, of class Person.
     */
    @Test
    public void testSetFirstName() {
        System.out.println("setFirstName");
        String firstName = "Jerome";
        p2.setFirstName(firstName);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getLastName method, of class Person.
     */
    @Test
    public void testGetLastName() {
        System.out.println("getLastName");
        String expResult = "Lopes";
        String result = p1.getLastName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setLastName method, of class Person.
     */
    @Test
    public void testSetLastName() {
        System.out.println("setLastName");
        String lastName = "Nicolas";
        p2.setLastName(lastName);
    }

    /**
     * Test of toString method, of class Person.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        String expResult = "Manuel Kevin Lopes";
        String result = p1.toString();
        assertEquals(expResult, result);
    }
    
}
