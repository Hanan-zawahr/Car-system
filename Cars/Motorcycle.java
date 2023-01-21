import java.util.Date;

public class Motorcycle extends Automobile {

    public double tierDiameter;
    public double length;

    public Motorcycle() {
        tierDiameter = 1.0;
        length = 1.0;
    }

    public Motorcycle(double tierDiameter, double length, String manufactureCompany, Date manufactureDate, String model, Engine engine, String plateNum, GearType gearType, String bodySereailNum) {
        this.tierDiameter = tierDiameter;
        this.length = length;
        this.manufactureCompany = manufactureCompany;
        this.manufactureDate = manufactureDate;
        this.model = model;
        this.engine = engine;
        this.plateNum = plateNum;
        this.gearType = GearType.UNDEFINED;
        this.bodySereailNum = bodySereailNum;
    }

    public double getTierDiameter() {
        return tierDiameter;
    }

    public void setTierDiameter(double tierDiameter) {
        this.tierDiameter = tierDiameter;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void print() {

        //System.out.println("Motorcycle[" + this.getManufactureCompany() + "//" + this.getModel() + "// \n" + this.getEngine() + "\n //" + this.getGearType() + "//" + this.getTierDiameter() + "//"this.getLength() + "]" + "\n");
    }
}
