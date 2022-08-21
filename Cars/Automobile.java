import java.util.Date;
public class Automobile
{
    public String ManufactureCompany;
    public Date ManufactureDate;   
    public String Model;
    public Engine Engine;
    public int plate_num; 
    public String gear_type; 
    private int body_serail_num;
    /**
     * Constructor for objects of class Automobile
     */
    public Automobile()
    {
        ManufactureCompany=null;
        ManufactureDate=null;
        Model=null;
        Engine=null;
        plate_num=0;
        gear_type=null;
        body_serail_num=0;
    }
    public Automobile(String ManufactureCompany,Date ManufactureDate,
    String Model,Engine Engine,int plate_num,String gear_type,
    int body_serail_num){
        this.ManufactureCompany=ManufactureCompany;
        this.ManufactureDate=ManufactureDate;
        this.Model=Model;
        this.Engine=Engine;
        this.plate_num=plate_num;
        this.gear_type=gear_type;
        this.body_serail_num=body_serail_num;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    //public int sampleMethod(int y)
    {
        // put your code here
        
    }
}
