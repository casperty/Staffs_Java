package ShowroomSystem;

import java.util.ArrayList;

/**
 *
 * @author Alexandre Ravaux
 */
public class Showroom {
    private ArrayList<Vehicle> showroom;
    private int currentIndex=0;
    public Showroom(){
        this.showroom= new ArrayList<Vehicle>();
    }
    public Showroom(ArrayList<Vehicle> list){
            this.showroom= list;
    }
    
    /* Getter and setter */
    public ArrayList<Vehicle> getShowroom() {
        return showroom;
    }

    public void setShowroom(ArrayList<Vehicle> showroom) {
        this.showroom = showroom;
    }
    
    /* Add a vehicle to the list */
    public void add(Vehicle v){
        this.showroom.add(v);
    }
    
    public Vehicle next(){
        if (currentIndex < showroom.size() - 1){
            currentIndex++;
            return showroom.get(currentIndex);
        }else{
            System.out.println("There is no next");
            return null;
        }
    }
	 
    public Vehicle previous(){
        if (currentIndex > 0){
            currentIndex--;
            return showroom.get(currentIndex);
        }else{
            System.out.println("There is no previous");
            return null;
        }
    }
    
    /* Show the content of the list */
    public String toString(){
        String disp="Showroom : \n";
        for(Vehicle v:this.showroom){
            disp+=v.toString()+"\n";
        }
        return disp;

    }
    /* Find a vehicle among the list thanks to the VIN */
    public void findVehicle(String vin){
        for(Vehicle v:this.showroom){
            if(v.getVin().equals(vin)){
                System.out.println(v);
            }
        } 
    }
    
    /* Returns the list the vehicle sold recently within 2 weeks */
    public ArrayList<Vehicle> getVehiclesSoldRecently(){
        ArrayList<Vehicle> listVehicles=new ArrayList<Vehicle>();
        for(Vehicle v:this.getShowroom()){
            if(v.getNbWeeks()<=2){
                listVehicles.add(v);
            }
        }
        return listVehicles;
    }
    
    /* Get current index in the list */
    public int getCurrentIndex() {
        return currentIndex;
    }
    
    /* Delete current car */
    public void delete(){
        showroom.remove(this.getCurrentIndex());
    }
    
    /* Reduction of 12 percent for all vehicles in the showroom */
    public void applyPromo(){
        for(Vehicle v:this.getShowroom()){
            if(v.getAgeOfVehicle()>=52){
                v.setCost(v.getCost()*(1.0-0.12));
            }
        }
    }
    
}