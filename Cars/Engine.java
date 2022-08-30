import java.util.Date;
import java.time.LocalDate;
public class Engine {
    public String manufacture;  
    public Date manufactureDate;
    public String model;
    public int capacity;
    public int cylinders;
    public String fuelType;
    public Engine () {
        manufacture = "";
        model = "";
        capacity = 0;
        cylinders = 4;
        fuelType = "unfound";
    }
    public Engine (String manufacture,Date manufactureDate,String model,
    int capacity,int cylinders,String fuelType) {
        this.manufacture = manufacture;
        this.manufactureDate = manufactureDate;
        this.model = model;
        this.capacity = capacity;
        this.cylinders = cylinders;
        this.fuelType = fuelType;
    }
}
