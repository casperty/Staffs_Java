package staffstutorial8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Alexandre Ravaux
 */
public class Showroom implements Serializable{
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
        String disp="";
        if(showroom.size()!=0){
            for(Vehicle v:this.showroom){
                disp+=v.toString()+"\n";
            }
        }else{
            disp+="Empty showroom";
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
    
    /* Delete vehicle from the list */
    public void delete(Vehicle v){
        this.showroom.remove(v);
    }
    
    /* Delete all */
    public void deleteAll(){
        this.showroom.removeAll(showroom);
    }
    
    /* Save the list into a text file */
    public void exportVehicles(){
        try { 
            File file = new File ("savedList.txt");
            if(!file.exists()){
                file.createNewFile();
            }
            FileWriter fw =new FileWriter(file);
            for(Vehicle v:showroom){
                fw.write(v.getManufacturer()+","+v.getModel()+","+v.getCustomerName()+","+v.getVin()+","+v.getDateOfManifacture()+","+v.getDateOfSale()+","+v.co2()+","+v.getTaxBand()+","+v.getCost()+"\n");
                //fw.write(v.toString());
            }
            fw.flush();
            fw.close();
            System.out.println("-- SHOWROOM SAVED --");

	} catch(IOException e) { 
        }    
    }
    
    /* Save the saved file */
    public void readSavedFile(){
        try { 
            int size=0;
            File file = new File ("savedList.txt");
            FileReader fr =new FileReader(file);
            String thisLine = null;
            BufferedReader br = new BufferedReader(fr);
            System.out.println("-- SAVED FILE CONTENT --");
            while ((thisLine = br.readLine()) != null) {
                System.out.println(thisLine);
            }       
            fr.close();
	} catch(IOException e) { 
            e.printStackTrace();
        }    
    }
    
    /* Add vehicle into showroom from a file */
    public void importVehicles(String fileGiven){
        try { 
            File file = new File (fileGiven);
            if(!file.exists()){
                System.out.println("No file found");
            }else{
                FileReader fr =new FileReader(file);
                String thisLine = null;
                String[] splitted=new String[9];
                BufferedReader br = new BufferedReader(fr);
                while((thisLine = br.readLine()) != null){
                    Vehicle v=new Vehicle();
                    splitted=thisLine.split(",");
                    v.setManufacturer(splitted[0]);
                    v.setModel(splitted[1]);
                    v.setCustomerName(splitted[2]);
                    v.setVin(splitted[3]);
                    v.setDateOfManifacture(splitted[4]);
                    v.setDateOfSale(splitted[5]);
                    v.setCost(Double.parseDouble(splitted[8]));
                    this.add(v);
                }
            }
	} catch(IOException e) { 
            e.printStackTrace();
        }    
    }
    
}
