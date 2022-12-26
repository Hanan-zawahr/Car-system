import java.util.Date;
import java.util.Scanner;
public class Car extends Vehicle {

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

    public boolean getIsFurnitreLeather() {
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

    @Override
    public String delete(Scanner in) {
        System.out.println("Please enter the bodySerailNum of the car that you want to delete it ");
        String bodySerialNum = in.next();
        return bodySerialNum;
    }

    @Override
    public String modify(Scanner in) {
        System.out.println("Please enter the bodySerailNum of the car that you want to modify it ");
        String bodySerialNum = in.next();
        return bodySerialNum;
    }

    @Override
    public void add(Scanner in) {
        System.out.print("Please enter the number of chairNum : ");
        setChairNum(in.nextInt());
        System.out.print("Please answer with true or false if the car has FurnitreLeather? : ");
        setIsFurnitreLeather(in.nextBoolean());
        System.out.print("Please enter length : ");
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
    public void printAll() {
        System.out.print(chairNum);
        System.out.print(isFurnitreLeather);
        System.out.print(getLength());
        System.out.print(getWidth());
        System.out.print(getColor());
        System.out.print(getManufactureCompany());
        System.out.print(getModel());
        System.out.print(getPlateNum());
        System.out.print(getBodySerailNum());
    }

}
