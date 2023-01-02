import java.util.Date;
import java.util.Scanner;

public class Car extends Vehicle {

    private Scanner in = new Scanner(System.in);
    private int chairNum;
    private boolean isFurnitreLeather;

    public Car(int chairNum, boolean isFurnitreLeather, double length, double width, String color, String manufactureCompany,
         Date manufactureDate, String model, Engine engine, String plateNum, GearType gearType, String bodySerailNum) {
        super(length, width, color, manufactureCompany, manufactureDate, model, engine, plateNum, gearType, bodySerailNum);
        this.chairNum = chairNum;
        this.isFurnitreLeather = isFurnitreLeather;
    }

    public Car() {
        chairNum = 4 + 1;
        isFurnitreLeather = false;
    }

    public Car(int chairNum, boolean isFurnitreLeather) {
        this.chairNum = chairNum;
        this.isFurnitreLeather = isFurnitreLeather;
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

    //Override
    public void add() {
        System.out.print("Please enter the number of chairNum : ");
        setChairNum(in.nextInt());
        System.out.print("Please answer with true or false if the car has FurnitreLeather? : ");
        setIsFurnitreLeather(in.nextBoolean());
        System.out.print("Please enter length : ");
        setLength(in.nextDouble());
           System.out.print("Please enter the number of width : ");
           setWidth(in.nextDouble());
    }

    //Override
    public void printAll() {
     //print all variables
     System.out.println("Car["+this.getManufactureCompany()+" // "+this.getModel()+" // \n"+this.getEngine()+"\n // "+this.getGearType()+" // "+this.getLength()+"]"+"\n");
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