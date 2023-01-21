import java.util.Date;
public class Truck extends Vehicle{
    private double freeWeight;
    private double fullWeight;
    public Truck(){
        freeWeight = 0.0;
        fullWeight = 0.0;
        length = 1.0;
        width = 1.0;
        color = "white";
        manufactureCompany = "not specified";
        manufactureDate = new Date(1970,1,1);
        model = "not appointed";
        engine = engine;
        plateNum = "not appointed";
        gearType = GearType.UNDEFINED;
        bodySereailNum = "not appointed";
    }
    public Truck(double freeWeight, double fullWeight, double length, double width, String color, String manufactureCompany, Date manufactureDate, String model, Engine engine, String plateNum, GearType gearType, String bodySereailNum){
        this.freeWeight = freeWeight;
        this.fullWeight = fullWeight;
        this.length = length;
        this.width = width;
        this.color = color;
        this.manufactureCompany = manufactureCompany;
        this.manufactureDate = new Date(1970,1,1);
        this.model = model;
        this.engine = engine;
        this.plateNum = plateNum;
        this.gearType = GearType.UNDEFINED;
        this.bodySereailNum = bodySereailNum;
    }
    public double getFreeWeight(){
        return freeWeight;
    }
    public void setFreeWeight(double freeweight){
        this.freeWeight = freeWeight;
    }
    public double getFullWeight(){
        return fullWeight;
    }
    public void setFfullWeight(double fullWeight){
        this.fullWeight = fullWeight;
    }
    public void print(){
       // System.out.print("Truck["+this.getManufactureCompany()+"//"+thisgetModel()+"//\n"+this.getEngine()+"\n //"+this.getGearType()+"//"+this.getLength()+"//"+this.freeWeight+"//"+this.fullWeight+"]"+"\n");
    }
}
