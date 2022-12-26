import java.util.Date;
import java.util.Scanner;
public class Motorcycle extends Automobile {

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

    @Override
    public void add(Scanner in) {
        System.out.print("Please enter the number  of tierDiameter : ");
        setTierDiameter(in.nextDouble());
        System.out.print("Please enter the number of length : ");
        setLength(in.nextDouble());
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
        System.out.print(tierDiameter);
        System.out.print(length);
        System.out.print(getManufactureCompany());
        System.out.print(getManufactureDate());
        System.out.print(getModel());
        System.out.print(getPlateNum());
        System.out.print(getBodySerailNum());
    }

}
