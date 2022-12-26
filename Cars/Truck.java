import java.util.Date;
import java.util.Scanner;
public class Truck extends Vehicle {
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

    @Override
    public void add(Scanner in) {
        System.out.print("Please enter the number of freeWeight : ");
        setFreeWeight(in.nextDouble());
        System.out.print("Please enter the number of fullWight : ");
        setFullWight(in.nextDouble());
        System.out.print("Please enter the number of Lingth : ");
        setLength(in.nextDouble());
        System.out.print("Please enter the number of width : ");
        setWidth(in.nextDouble());
        System.out.print("Please enter the color : ");
        setColor(in.nextLine());
        System.out.print("Please enter the name of manufactureCompany : ");
        setManufactureCompany(in.nextLine());
        System.out.print("Please enter the model : ");
        setModel(in.nextLine());
        System.out.print("Please enter the plateNum : ");
        setPlateNum(in.nextLine());
        System.out.print("Please enter the bodySerailNum : ");
        setBodySerailNum(in.nextLine());
    }

    @Override
    public String delete(Scanner in) {
           System.out.println("Please enter the bodySerailNum of the car that you want to delete it ");
        String serialNum = in.next();
        return serialNum;
     
    }

    @Override
    public String modify(Scanner in) {
        System.out.println("Please enter the bodySerailNum of the car that you want to modify it ");
        String serialNum = in.next();
         return serialNum;
    }

    @Override
    public void printAll() {
        System.out.print(freeWeight);
        System.out.print(fullWight);
        System.out.print(getLength());
        System.out.print(getWidth());
        System.out.print(getColor());
        System.out.print(getManufactureCompany());
        System.out.print(getModel());
        System.out.print(getPlateNum());
        System.out.print(getBodySerailNum());
    }

}
    
