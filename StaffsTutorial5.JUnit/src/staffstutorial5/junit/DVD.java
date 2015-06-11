package staffstutorial5.junit;

/**
 *
 * @author Alexandre Ravaux
 */
public class DVD {
    String title;
    Person leadActor;
    int noOfStars;

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
    public String toString() {
        return title+" "+leadActor +" "+noOfStars+"\n";
    }
    
    
}
