import java.util.Date;

public abstract class Vehicle extends Automobile {

    private double length;
    private double width;
    private String color;

    public Vehicle(double length, double width, String color, String manufactureCompany, Date manufactureDate, String model, Engine engine, String plateNum, GearType gearType, String bodySerailNum) {
        super(manufactureCompany, manufactureDate, model, engine, plateNum, gearType, bodySerailNum);
        this.length = length;
        this.width = width;
        this.color = color;
    }

    public Vehicle() {
        length = 1.0;
        width = 1.0;
        color = "white";
    }

    public Vehicle(double length, double width, String color) {
        this.length = length;
        this.width = width;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    
}