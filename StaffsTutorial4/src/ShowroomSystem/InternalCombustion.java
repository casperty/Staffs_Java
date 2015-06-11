package ShowroomSystem;

/**
 *
 * @author Alexandre Ravaux
 */
public class InternalCombustion extends Vehicle{
    private double consumption;

    /* Constructor with all attributes */
    public InternalCombustion(String manufacturer, String model, String vin, String dateOfManifacture, char taxBand, double cost, double consumption) {
        super(manufacturer, model, vin, dateOfManifacture, taxBand, cost);
        this.consumption=consumption;
    }

    public double getConsumption() {
        return consumption;
    }

    public void setConsumption(double consumption) {
        this.consumption = consumption;
    }

    @Override
    public String toString() {
        return super.toString()+ "Consumption : " + consumption;
    }  
}
