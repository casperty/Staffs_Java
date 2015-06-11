/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staffstutorial3;

/**
 *
 * @author Alexandre Ravaux
 */
public class TestStudent {
    /**
    * @param args the command line arguments
    */
    public static void main(String[] args) {
        Student s1 = new Student("Cathy", 21, "Smithfield Drive");
        Student.Address anotherAddress = s1.new Address(8, "Deerfield Way");		
        // note the use of new
        System.out.println(anotherAddress.toString());
        
        System.out.println(s1);
        //Address is an anonymous class related to Student
        s1.setUniAddress(anotherAddress);
        System.out.println(s1);
        
    }
    
}
