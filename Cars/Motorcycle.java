import java.util.Date;
import java.util.Scanner;

public class Motorcycle extends Automobile {

    private Scanner in = new Scanner(System.in);
    private double tierDiameter;
    private double length;

    public Motorcycle() {
        tierDiameter = 1.0;
        length = 1.0;
    }

    public Motorcycle(double tierDiameter, double length, String manufactureCompany, Date manufactureDate, String model, Engine engine, String plateNum, GearType gearType, String bodySerailNum) {
        super(manufactureCompany, manufactureDate, model, engine, plateNum, gearType, bodySerailNum);
        this.tierDiameter = tierDiameter;
        this.length = length;
    }

    public Motorcycle(double tierdiameter, double length) {
        this.tierDiameter = tierdiameter;
        this.length = length;
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
        System.out.println("Motorcycle["+this.getManufactureCompany()+" // "+this.getModel()+" // \n"+this.getEngine()+"\n // "+this.getGearType()+" // "+this.getTierDiameter()+" // "+this.getLength()+"]"+"\n");
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