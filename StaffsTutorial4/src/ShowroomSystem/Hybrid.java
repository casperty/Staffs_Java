package ShowroomSystem;

/**
 *
 * @author alexandre
 */
public class Hybrid extends Vehicle{
    private double consumption;
    private String drive;

    /* Constructor with all attributes */
    public Hybrid(String manufacturer, String model, String vin, String dateOfManifacture, char taxBand, double cost, double consumption, String drive) {
        super(manufacturer, model, vin, dateOfManifacture, taxBand, cost);
        this.consumption=consumption;
        this.drive=drive;
    }

    public double getConsumption() {
        return consumption;
    }

    public void setConsumption(double consumption) {
        this.consumption = consumption;
    }

    public String getDrive() {
        return drive;
    }

    public void setDrive(String drive) {
        this.drive = drive;
    }

    @Override
    public String toString() {
        return super.toString()+ "Consumption : " + consumption + "\nDrive : " + drive ;
    }  
}
