import java.util.Date;
import java.util.Date;
import java.util.Scanner;

public class Truck extends Vehicle {
    private double freeWeight;
    private double fullWight;

    public Truck() {
        freeWeight = 0.0;
        fullWight = 0.0;
    }
    
    public Truck(double freeWeight, double fullWight, double length, double width, String color, String manufactureCompany
            , Date manufactureDate, String model, Engine engine, String plateNum, GearType gearType, String bodySerailNum) {
        this.freeWeight = freeWeight;
        this.fullWight = fullWight;
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

    public double getFullWight() {
        return fullWight;
    }

    public void setFullWight(double fullWight) {
        this.fullWight = fullWight;
    }

    public double getFreeWeight() {
        return freeWeight;
    }

    public void setFreeWeight(double freeWeight) {
        this.freeWeight = freeWeight;
    }

    public void print() {
     //print all variables
     System.out.println("Car["+this.getManufactureCompany()+" // "+this.getModel()+" // \n"+this.getEngine()+"\n // "+this.getGearType()+" // "+this.getLength()+" // "+this.freeWeight+" // "+this.fullWight+"]"+"\n");
    }
}