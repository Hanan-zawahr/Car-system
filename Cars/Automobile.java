import java.util.Date;
public class Automobile {
    protected String manufactureCompany;
    protected Date manufactureDate;
    protected String model;
    protected Engine engine;
    protected String plateNum;
    protected GearType gearType;
    protected String bodySereailNum;

    public String getManufactureCompany(){
        return manufactureCompany;
    }

    public void setManufactureCompany(String manufactureCompany){
        this.manufactureCompany = manufactureCompany;
    }

    public Date getManufactureDate(){
        return manufactureDate;
    }

    public void setManufactureDate(Date manufactureDate){
        this.manufactureDate = manufactureDate;
    }

    public String getModel(){
        return model;
    }

    public void setModel(String model){
        this.model = model;
    }

    public Engine getEngine(){
        return engine;
    }

    public void setEngine(Engine engine){
        this.engine = engine;
    }

    public String getPlateNum (){
        return plateNum;
    }

    public void setPlateNum (String plateNum){
        this.plateNum = plateNum;
    }

    public GearType getGearType (){
        return gearType;
    }

    public void setGearType (GearType gearType){
        this.gearType = gearType;
    }

    public String getBodySereailNum(){
        return bodySereailNum;
    }

    public void setBodySereailNum(String bodySereailNum){
        this.bodySereailNum = bodySereailNum;
    }
}
