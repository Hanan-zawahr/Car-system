import java.util.Date;

public class Car extends Vehicle {
    
    private int chairNum;
    private boolean isFurnitreLeather;

    public Car() {
        chairNum = 4 + 1;
        isFurnitreLeather = false;
        length = 1.0;
        width = 1.0;
        color = "white";
        manufactureCompany = "not specified";
        manufactureDate = new Date(1 - 1 - 1970);
        model =" not specified";
        engine = engine ;
        plateNum = "not appointed";
        gearType = GearType.UNDEFINED;
        bodySerailNum = "not appointed";
    }
    
    public Car(int chairNum, boolean isFurnitreLeather, double length, double width, String color, String manufactureCompany,
         Date manufactureDate, String model, Engine engine, String plateNum, GearType gearType, String bodySerailNum) {
        this.chairNum = chairNum;
        this.isFurnitreLeather = isFurnitreLeather;
        this.length = length;
        this.width = width;
        this.color = color;
        this.manufactureCompany = manufactureCompany;
        this.manufactureDate = manufactureDate;
        this.model = model;
        this.engine = engine;
        this.plateNum = plateNum;
        this.gearType = gearType;
        this.bodySerailNum = bodySerailNum;
    }

    public boolean isIsFurnitreLeather() {
        return isFurnitreLeather;
    }

    public void setIsFurnitreLeather(boolean isFurnitreLeather) {
        this.isFurnitreLeather = isFurnitreLeather;
    }

    public int getChairNum() {
        return chairNum;
    }

    public void setChairNum(int chairNum) {
        this.chairNum = chairNum;
    }
    
    public void print() {
     //print all variables
     System.out.println("Car["+this.getManufactureCompany()+" // "+this.getModel()+" // \n"+this.getEngine()+"\n // "+this.getGearType()+" // "+this.getLength()+"]"+"\n");
    }

}