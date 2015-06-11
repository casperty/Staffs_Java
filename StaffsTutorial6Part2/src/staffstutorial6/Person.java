package staffstutorial6;

import java.util.Objects;

/**
 *
 * @author Alexandre Ravaux
 */
public class Person implements Cloneable, Comparable{
    private String firstName, lastName;

    public Person() {
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Person){
            if (this == obj){
                return true;
            }    
            if (obj == null){
                return false;
            }         
            if (getClass() != obj.getClass()){
                 return false;
            }    
            Person other = (Person) obj;
            if (this.getFirstName().equals(other.getFirstName()) && this.getLastName().equals(other.getLastName())){
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.firstName);
        hash = 29 * hash + Objects.hashCode(this.lastName);
        return hash;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Person temp = new Person();
        temp.setFirstName(this.getFirstName());
        temp.setLastName(this.getLastName());
        return temp;
    }
     
    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
    

    @Override
    public int compareTo(Object obj) {
        final int EQUAL = 0;
        if(obj instanceof Person){
            Person other = (Person) obj;
            if (this == other) return EQUAL;
            int comp=this.getLastName().compareTo(other.getLastName());
            if(comp != EQUAL) return comp;
            comp=this.getFirstName().compareTo(other.getFirstName());
            if(comp != EQUAL) return comp;
            
            assert this.equals(other) : "compareTo inconsistent with equals.";
        }
        return EQUAL;
    }
}
