package staffstutorial0;

/**
 *
 * @author Alexandre Ravaux
 */
public class Player {
    /* Attiribute */
    private String name;
    private String position;
    int age;
    /* Constructor */
    public Player(String n, String p, int a){
        this.name=n;
        this.position=p;
        this.age=a;
    }
    
    /* Getters and setters */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    /* Display */
    @Override
    public String toString() {
        return "Player{" + "name=" + name + ", position=" + position + ", age=" + age + '}';
    }
    
    
}
