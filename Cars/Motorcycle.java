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
        System.out.print("tierDiameter :" + this.getTierDiameter());
        System.out.print("length :" + this.getLength());
        System.out.print("manufactureDate :" + this.getManufactureDate());
        System.out.print("model :" + this.getModel());
        System.out.print("engine :" + this.getEngine());
        System.out.print("plateNum :" + this.getPlateNum());
        System.out.print("gearType :" + this.getGearType());
         System.out.print("bodySereailNum :" + this.getBodySereailNum());
    }
}
