import java.util.Date;

public class Engine {

    public String manufacture;
    public Date manufactureDate;
    public String model;
    public int capacity;
    public int cylinders;
    public FuelType fuelType;

    public Engine() {
        manufacture = "not specified";
        manufactureDate = new Date(1970, 1, 1);
        model = "not specified";
        capacity = 0;
        cylinders = 4;
        fuelType = FuelType.UNDEFINED;
    }

    public Engine(String manufacture, Date manufactureDate, String model, int capacity, int cylinders, FuelType fuelType) {
        this.manufacture = manufacture;
        this.manufactureDate = manufactureDate;
        this.model = model;
        this.capacity = capacity;
        this.cylinders = cylinders;
    }

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

    public int getCylinders(int cylinders) {
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

    public String toString() {
        return "Engine[" + capacity + "//" + cylinders + "//" + fuelType + "]";
    }
}


