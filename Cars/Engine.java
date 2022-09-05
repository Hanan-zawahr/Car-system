import java.util.Date;
public class Engine {
    public String manufacture;  
    public Date manufactureDate;
    public String model;
    public int capacity;
    public int cylinders;
    private FuelType fuelType;
    public Engine() {
        manufacture = "not specified";
        manufactureDate = new Date(1-1-1970);
        model = "not specified";
        capacity = 0;
        cylinders = 4;
        fuelType = fuelType.UNDEFINED;
    }
    public Engine(String manufacture, Date manufactureDate, String model,
    int capacity, int cylinders, FuelType fuelType) {
        this.manufacture = manufacture;
        this.manufactureDate = manufactureDate;
        this.model = model;
        this.capacity = capacity;
        this.cylinders = cylinders;
        this.fuelType = fuelType;
    }
}
