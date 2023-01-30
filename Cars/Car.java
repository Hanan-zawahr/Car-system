import java.util.Date;

public class Car extends Vehicle{

    private int chairNum;
    private boolean isFurnitreLeather;

    public Car() {
        chairNum = 1 + 4;
        isFurnitreLeather = false;
        length = 1.0;
        width = 1.0;
        color = "white";
        manufactureCompany = "not specified";
        manufactureDate = new Date(1970,1,1);
        model = "not appointed";
        engine = engine;
        plateNum = "not appointed";
        gearType = GearType.UNDEFINED;
        bodySereailNum = "not appointed";
    }

    public Car(int chairNum, boolean isFurnitreLeather, double length, double width, String color, String manufactureCompany, Date manufactureDate, String model, Engine engine, String plateNum, GearType gearType, String bodySereailNum) {
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
        this.bodySereailNum = bodySereailNum;
    }

    public int getChairNum(){
        return chairNum;
    }

    public void setChairNum(int chairNum){
        this.chairNum = chairNum;
    }

    public boolean getIsFurnitreLeather(){
        return isFurnitreLeather;
    }

    public void setIsFurnitreLeather(boolean isFurntierLeather){
        this.isFurnitreLeather = isFurntierLeather;
    }

    public void print(){
        System.out.println("ManufactureDate => " + this.getManufactureDate());
        System.out.println(" Engine Model => " + this.getModel());
        System.out.println("ManufactureCompany => " + this.getManufactureCompany());
        System.out.println("Model => " + this.getModel());
        System.out.println("plateNum => " + this.getPlateNum());
        System.out.println("GearType => " + this.getGearType());
        System.out.println("Length => " + this.getLength());
        System.out.println("width => " + this.getWidth());
        System.out.println("Color => " + this.getColor());
        System.out.println("ChairNum => " + this.getChairNum());
        System.out.println("IsFurnitreleather => " + this.getIsFurnitreLeather());

    }

    public String toString() {
        return  "ManufacturerDate : " + this.getManufactureDate() + " model : " + this.getModel() +
        " ManufactureCompany : " + this.getManufactureCompany() + " PlateNum : " + this.getPlateNum() + " GearType: " +
        this.getGearType() + " length: " + this.getLength() + " width: " + this.getWidth()+
        " color: " + this.getColor() + " ChairNum: " + this.getChairNum() +
        " IsFurnitreLeather: " + this.getIsFurnitreLeather();
     }

}

