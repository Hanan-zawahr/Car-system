public class Truck extends Vehicle {
    public double freeWeight;
    public double fullWight;
    public Truck() {
        freeWeight = 0.0;
        fullWight = 0.0;
    }
    public Truck(double freeWeight, double fullWight) {
        this.freeWeight = freeWeight; 
        this.fullWight = fullWight;
    }
}
