package Test;

import org.junit.Before;
import org.junit.Test;
import staffstutorial6.Person;
import static org.junit.Assert.*;
import staffstutorial6.DVD;

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
    
        /**
     * Test equals
     */
    @Test
    public void testEquals() {
        System.out.println("testEquals Person");
        Person p2 = new Person("Manuel Kevin", "Lopes");
        Person p3 = new Person("Leonardo", "DiCaprio");

        assertEquals(p2, p1);
        assertNotSame(p2, p1);
        assertEquals(p1, p1);
        assertSame(p1, p1);
        assertFalse(p3.equals(p1));
    }
    
    @Test
    public void  testCompareTo(){
        System.out.println("testCompareTo Person");
        Person p2 = new Person("Manuel Kevin", "Lopes");
        Person p3 = new Person("Leonardo", "DiCaprio");
        Person p4 = new Person();
        p4.setLastName("DiCaprio");
        p4.setFirstName("Leonardo");       
        
        assertEquals("comparable",0, p1.compareTo(p2));   
        assertEquals("comparable",0, p2.compareTo(p1)); 
        assertEquals("comparable",0, p3.compareTo(p4)); 
        assertEquals("comparable",0, p4.compareTo(p3)); 
        assertNotSame("comparable",0, p2.compareTo(p4)); 
        
    }
    
}
