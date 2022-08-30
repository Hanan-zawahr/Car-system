import java.util.Date;
public class Automobile {
    public String manufactureCompany;
    public Date manufactureDate;   
    public String model;
    public Engine engine;
    public int PLATE_NUM; 
    public String GEAR_TYPE; 
    private int BODY_SERAIL_NUM;
    public Automobile() {
        manufactureCompany = "";
        model = "";
        engine = engine;
        PLATE_NUM = 0000;
        GEAR_TYPE = "unfound";
        BODY_SERAIL_NUM = 0;
    }
    public Automobile (String manufactureCompany, Date manufactureDate,
    String model, Engine engine, int PLATE_NUM, String GEAR_TYPE,
    int BODY_SERAIL_NUM) {
        this.manufactureCompany = manufactureCompany;
        this.manufactureDate = manufactureDate;
        this.model = model;
        this.engine = engine;
        this.PLATE_NUM = PLATE_NUM;
        this.GEAR_TYPE = GEAR_TYPE ;
        this.BODY_SERAIL_NUM = BODY_SERAIL_NUM;
    }
}
