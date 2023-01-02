import java.util.Date;
import java.util.Date;
import java.util.Scanner;

public class Truck extends Vehicle {

    private Scanner in = new Scanner(System.in);
    private double freeWeight;
    private double fullWight;

    public Truck(double freeWeight, double fullWight, double length, double width, String color, String manufactureCompany
            , Date manufactureDate, String model, Engine engine, String plateNum, GearType gearType, String bodySerailNum) {
        super(length, width, color, manufactureCompany, manufactureDate, model, engine, plateNum, gearType, bodySerailNum);
        this.freeWeight = freeWeight;
        this.fullWight = fullWight;
    }

    public Truck() {
        freeWeight = 0.0;
        fullWight = 0.0;
    }

    public Truck(double freeWeight, double fullWight) {
        this.freeWeight = freeWeight;
        this.fullWight = fullWight;
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

    //Override
    public void add() {
     //like add in car
    }

    //Override
    public String delete() {
           System.out.println("Please enter the bodySerailNum of the car that you want to delete it ");
        String serialNum = in.next();
        return serialNum;
    }

    //Override
    public String modify() {
      System.out.println("Please enter the bodySerailNum of the car that you want to modify it ");
     String serialNum = in.next();
     return serialNum;
    }

   @Override
    public void printAll() {
     //print all variables
     System.out.println("Car["+this.getManufactureCompany()+" // "+this.getModel()+" // \n"+this.getEngine()+"\n // "+this.getGearType()+" // "+this.getLength()+" // "+this.freeWeight+" // "+this.fullWight+"]"+"\n");
    }

    @Override
    public void add(Scanner in) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String delete(Scanner in) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String modify(Scanner in) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}