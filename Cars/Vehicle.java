import java.util.Date;
public class Vehicle extends Automobile {
    protected double length;
    protected double width;
    protected String color;
    
    public double getlength(){
        return length;
    }
    public void setLength(double length){
        this.length = length;
    }
    public double getWidth(){
        return width;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    
}
