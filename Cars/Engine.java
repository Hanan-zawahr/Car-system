import java.util.Date;
public class Engine
{
    public String Manufacture;  
    public Date ManufactureDate;
    public String Model;
    public int Capacity;
    public int Cylinders;
    public String fuelType;
    public Engine()
    {
        Manufacture=null;
        ManufactureDate=null;
        Model=null;
        Capacity=0;
        Cylinders=0;
        fuelType=null;
    }
    public Engine(String Manufacture,Date ManufactureDate,String Model,
    int Capacity,int Cylinders,String fuelType){
        this.Manufacture=Manufacture;
        this.ManufactureDate=ManufactureDate;
        this.Model=Model;
        this.Capacity=Capacity;
        this.Cylinders=Cylinders;
        this.fuelType=fuelType;
    
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
