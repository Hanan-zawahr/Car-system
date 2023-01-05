import java.util.Date;

public class Engine {
    
    protected String manufacture;
    protected Date manufactureDate;
    protected String model;
    protected int capacity;
    protected int cylinders;
    protected FuelType fuelType;

    public String getManufacture() {
        return manufacture;
    }

     public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
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

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getCylinders() {
        return cylinders;
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }
    
    @Override
    public String toString(){
        return "Engine["+capacity+" // "+cylinders+" // "+fuelType+"]";
    }
}