package ShowroomSystem;

/**
 *
 * @author Alexandre Ravaux
 */
public class Electric extends Vehicle{
    private int range;
    private String batterytype;

    /* Constructor with all attributes */
    public Electric(String manufacturer, String model, String vin, String dateOfManifacture, char taxBand, double cost, int range, String batterytype) {
        super(manufacturer, model, vin, dateOfManifacture, taxBand, cost);
        this.range=range;
        this.batterytype=batterytype;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public String getBatterytype() {
        return batterytype;
    }

    public void setBatterytype(String batterytype) {
        this.batterytype = batterytype;
    }

    @Override
    public String toString() {
        return super.toString()+ "Range : " + range + "\nBatterytype : " + batterytype ;
    }
    
    
    
}
