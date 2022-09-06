import java.util.Date;
public class Automobile {
    public String manufactureCompany;
    public Date manufactureDate;   
    public String model;
    public Engine engine;
    public String plateNum; 
    private GearType gearType; 
    private String bodySerailNum;
    public Automobile() {
        manufactureCompany = "not specified";
        manufactureDate = new Date(1-1-1970);
        model = "not specified";
        engine = engine;
        plateNum = "not appointed";
        gearType = gearType.UNDEFINED;
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
}
