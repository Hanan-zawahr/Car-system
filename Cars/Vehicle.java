public class Vehicle extends Automobile {
    public double length;
    public double width; 
    public String color;
    public Vehicle() {
        length = 1.0; 
        width = 1.0;
        color = "white";
    }
    public Vehicle(double length, double width, String color) {
        this.length = length;
        this.width = width;
        this.color = color;
    }
}
