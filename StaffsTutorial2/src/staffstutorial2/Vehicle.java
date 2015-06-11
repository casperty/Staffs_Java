package staffstutorial2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author Alexandre Ravaux
 */
public class Vehicle {
    private String manufacturer;
    private String model;
    private Customer customer;
    private String vin;
    private String dateOfManifacture;
    private String dateOfSale;
    private boolean isSold=false;
    private char taxBand;
    private double cost;
    
    /* Default constructor */
    public Vehicle() {
        this.manufacturer = "Unknown Manufacturer";
        this.model = "Unknown Model";
        this.customer = new Customer();
        this.vin = "Unknown VIN";
        this.dateOfManifacture = "Unknown date";
        this.dateOfSale = "Unknown date";
        this.taxBand = 'A';
        this.cost = 0.0;
    }

    /* By default, the vehicle has no owner and not sold to anyone 
    so we can't precise here the owner or the date where it has been sold*/
    public Vehicle(String manufacturer, String model, String vin, String dateOfManifacture, char taxBand, double cost) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.vin = vin;
        this.dateOfManifacture = dateOfManifacture;
        this.taxBand = taxBand;
        this.cost = cost;
    }
    
    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public Date getDateOfManifacture() {
        Date t=new Date();
        SimpleDateFormat ft = new SimpleDateFormat ("dd-MM-yyyy");
        try { 
          t = ft.parse(dateOfManifacture); 
        } catch (ParseException e) { 
            System.out.println("Unparseable using " + ft); 
        }
        return t;
    }

    public void setDateOfManifacture(String dateOfManifacture) {
        this.dateOfManifacture = dateOfManifacture;
    }

    public String getDateOfSale() {
        return dateOfSale;
    }

    public void setDateOfSale(String dateOfSale) {
        this.dateOfSale = dateOfSale;
    }

    public boolean isIsSold() {
        return isSold;
    }

    public void setIsSold(boolean isSold) {
        this.isSold = isSold;
    }

    public char getTaxBand() {
        return taxBand;
    }

    public void setTaxBand(char taxBand) {
        this.taxBand = taxBand;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void buy(Customer customer){
        this.setCustomer(customer);
        this.isSold=true;
        Calendar cal=new GregorianCalendar();
        this.dateOfSale=cal.get(Calendar.DAY_OF_MONTH)+"-"+cal.get(Calendar.MONTH)+"-"+cal.get(Calendar.YEAR); 
    }
    
    public String co2(){
        String display="";
        switch(this.taxBand){
            case 'A': display="0-100";break;
            case 'B': display="101-110";break;
            case 'C': display="111-120";break;
            case 'D': display="121-130";break;
            case 'E': display="131-140";break;
            case 'F': display="141-150";break;
            case 'G': display="151-160";break;
            default:display="No CO2 ?";break;
        }
        return display;
    }
    
    public long getAgeOfVehicle(){
    	Date dateManufacture = this.getDateOfManifacture();
    	Date today = new Date ();
    	long ageOfVehicle = today.getTime() - dateManufacture.getTime();
    	ageOfVehicle = (long) (ageOfVehicle / (60*60*24*1000*7));
    	return ageOfVehicle;
    }
    
    /* Method which returns the number of weeks since the car has been sold */
    public long getNbWeeks(){
        Date t=new Date();
        SimpleDateFormat ft = new SimpleDateFormat ("dd-MM-yyyy");
        long nbWeeks=0;
        try { 
            t = ft.parse(dateOfManifacture);
            Date today = new Date ();
            nbWeeks = today.getTime() - t.getTime();
            nbWeeks = (long) (nbWeeks / (60*60*24*1000*7));
        } catch (ParseException e) { 
            System.out.println("Unparseable using " + ft); 
        }
        return nbWeeks;
    }
    
    @Override
    public String toString() {
        String owner, dateSale;
        /* If those two values are null, we display "No owner" and "Not sold" */
        if(this.customer!=null){
            if (this.customer.getName()!=null) {owner=this.customer.getName();}else{owner="No owner";}
        }else{
            owner="No owner";
        }
        if(this.isSold){dateSale=dateOfSale;}else{dateSale="Not sold";}
        return "Manufacturer : "+manufacturer + "\nModel : " + model + "\nCustomer name : " + owner + "\nVIN: " + vin + "\nDate of manufacture: " + dateOfManifacture + "\nDate of sale : " + dateSale +  "\nTax band : " + taxBand + " (CO2: " + co2() +")\nCost : " + cost+"\n";
    }
    
    

    
}
