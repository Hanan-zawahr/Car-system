import java.util.Date;
import java.util.Scanner;

public class Car extends Vehicle {
    
    private int chairNum;
    private boolean isFurnitreLeather;

    public Car() {
        chairNum = 4 + 1;
        isFurnitreLeather = false;
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