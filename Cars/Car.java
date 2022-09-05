public class Car extends Vehicle {
    public int chairNum;
    public boolean isFurnitreLeather; 
    public Car() {
        chairNum = 4+1;
        isFurnitreLeather = false;
    }
    public Car(int chairNum, boolean isFurnitreLeather) {
        this.chairNum = chairNum;
        this.isFurnitreLeather = isFurnitreLeather;
    }
}
