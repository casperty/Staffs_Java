package staffstutorial0;

import java.util.ArrayList;

/**
 *
 * @author Alexandre Ravaux
 */
public class Team {
    private String teamName;
    private ArrayList<Player>myTeam;
    /* Constructor by default */
    public Team(){
        this.teamName="Unknown name";
        this.myTeam=new ArrayList<Player>();
    }
    /* Constructor with the name */
    public Team(String name){
        this.teamName=name;
        this.myTeam=new ArrayList<Player>();
    }
    /* Constructor with the name + list of players */
    public Team(String name, ArrayList<Player> list){
        this.teamName=name;
        this.myTeam=new ArrayList<Player>();
        for(Player player:list){
            this.myTeam.add(player);
        }
        
    }
    /* Getters and setters */
    
    public String getTeamName() {
        return teamName;
    }
    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public ArrayList<Player> getMyTeam() {
        return myTeam;
    }

    public void setMyTeam(ArrayList<Player> myTeam) {
        this.myTeam = myTeam;
    }
    
    /* Add item to the ArrayList */
    public void add(Player p){
        this.myTeam.add(p);
    }
    public String toString(){
        String display=this.teamName+" :";
        for(Player p:this.myTeam){
            display+="\n"+p.toString();
        }
        return display;
    }
}
