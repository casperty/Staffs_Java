package staffstutorial6;

import java.util.Objects;

/**
 *
 * @author Alexandre Ravaux
 */
public class DVD implements Cloneable, Comparable{
    String title;
    Person leadActor;
    int noOfStars;
    
    public DVD(){}

    public DVD(String title, Person leadActor, int noOfStars) {
        this.title = title;
        this.leadActor = leadActor;
        this.noOfStars = noOfStars;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Person getLeadActor() {
        return leadActor;
    }

    public void setLeadActor(Person leadActor) {
        this.leadActor = leadActor;
    }

    public int getNoOfStars() {
        return noOfStars;
    }

    public void setNoOfStars(int noOfStars) {
        this.noOfStars = noOfStars;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof DVD){
            if (this == obj){
                return true;
            }    
            if (obj == null){
                return false;
            }         
            if (getClass() != obj.getClass()){
                 return false;
            }    
            DVD other = (DVD) obj;
            if (this.getTitle() == other.getTitle() && this.getLeadActor().equals(other.getLeadActor()) && this.getNoOfStars()==other.getNoOfStars()){
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 73 * hash + Objects.hashCode(this.title);
        hash = 73 * hash + Objects.hashCode(this.leadActor);
        hash = 73 * hash + this.noOfStars;
        return hash;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        DVD temp = new DVD();
        temp.setTitle(this.getTitle());
        Person actor=new Person();
        actor=(Person)leadActor.clone();
        temp.setLeadActor(actor);
        temp.setNoOfStars(this.getNoOfStars());
        return temp;
    }
    
    @Override
    public String toString() {
        return title+" "+leadActor +" "+noOfStars+"\n";
    }

    @Override
    public int compareTo(Object obj) {
        final int BEFORE = -1;
        final int EQUAL = 0;
        final int AFTER = 1;
        if(obj instanceof DVD){
            DVD other = (DVD) obj;
            if (this == other) return EQUAL;
            int comp=this.getTitle().compareTo(other.getTitle());
            if(comp != EQUAL) return comp;
            comp=this.getLeadActor().compareTo(other.getLeadActor());
            if(comp != EQUAL) return comp;
            if (this.getNoOfStars()  == other.getNoOfStars() ) return AFTER;
            if (this.getNoOfStars() < other.getNoOfStars() ) return BEFORE;
            if (this.getNoOfStars()  > other.getNoOfStars() ) return AFTER;
        }
        return EQUAL;
    }
    
    
}
