import java.time.LocalDate;

public class Motorcycle extends Automobile {

    public double tierDiameter;
    public double length;

    public Motorcycle() {
        tierDiameter = 1.0;
        length = 1.0;
    }

    public Motorcycle(double tierDiameter, double length, String manufactureCompany, LocalDate manufactureDate, String model, Engine engine, String plateNum, GearType gearType, String bodySerailNum) {
        this.tierDiameter = tierDiameter;
        this.length = length;
        this.manufactureCompany = manufactureCompany;
        this.manufactureDate = manufactureDate;
        this.model = model;
        this.engine = engine;
        this.plateNum = plateNum;
        this.gearType = gearType;
        this.bodySerailNum = bodySerailNum;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getTierDiameter() {
        return tierDiameter;
    }

    public void setTierDiameter(double tierDiameter) {
        this.tierDiameter = tierDiameter;
    }

    public void print() {
        //print all variables
        System.out.println("Motorcycle[" + this.getManufactureCompany() + " // " + this.getModel() + " // \n" + this.getEngine() + "\n // " + this.getGearType() + " // " + this.getTierDiameter() + " // " + this.getLength() + "]" + "\n");
    }
}
