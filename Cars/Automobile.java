import java.util.Date;
import java.util.Scanner;
public abstract class Automobile implements Add,Delete,Modify,Print {

    private String manufactureCompany;
    private Date manufactureDate;
    private String model;
    private Engine engine;
    private String plateNum;
    private GearType gearType;
    private String bodySerailNum;

    public Automobile() {
        manufactureCompany = "not specified";
        manufactureDate = new Date(1 - 1 - 1970);
        model = "not specified";
        engine = engine;
        plateNum = "not appointed";
        gearType = GearType.UNDEFINED; 
        bodySerailNum = "not appointed";
    }

    public Automobile(String manufactureCompany, Date manufactureDate,
            String model, Engine engine, String plateNum, GearType gearType,
            String bodySerailNum) {
        this.manufactureCompany = manufactureCompany;
        this.manufactureDate = manufactureDate;
        this.model = model;
        this.engine = engine;
        this.plateNum = plateNum;
        this.gearType = gearType;
        this.bodySerailNum = bodySerailNum;
    }

    public String getManufactureCompany() {
        return manufactureCompany;
    }

    public void setManufactureCompany(String manufactureCompany) {
        this.manufactureCompany = manufactureCompany;
    }

    public Date getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getPlateNum() {
        return plateNum;
    }

    public void setPlateNum(String plateNum) {
        this.plateNum = plateNum;
    }

    public GearType getGearType() {
        return gearType;
    }

    public void setGearType(GearType gearType) {
        this.gearType = gearType;
    }

    public String getBodySerailNum() {
        return bodySerailNum;
    }

    public void setBodySerailNum(String bodySerailNum) {
        this.bodySerailNum = bodySerailNum;
    }

}
    
