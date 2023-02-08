import java.util.Date;
public class Vehicle extends Automobile {
	protected double length;
	protected double width;
    protected String color;
    public Vehicle() {
    	width = 1.0;
        color = "white";
    }
    public Vehicle(double length,double width, String color, String manufactureCompany, 
    		Date manufactureDate, String model, Engine engine, String plateNum, 
    		GearType gearType, String bodySereailNum) {
        this.width = width;
        this.color = color;
        this.length = length;
        this.model = model;
        this.manufactureCompany = manufactureCompany;
        this.manufactureDate = manufactureDate;
        this.engine = engine;
        this.plateNum = plateNum;
        this.gearType = gearType;
        this.bodySereailNum = bodySereailNum;
    }
    public double getLength(){
        return length;
    }
    public void setLength(double length){
        this.length = length;
    }
    public double getWidth(){
        return width;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    
}

