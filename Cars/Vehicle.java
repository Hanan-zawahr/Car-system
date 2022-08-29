import java.awt.Color;
public class Vehicle extends Automobile {
    public int length;
    public int width; 
    public Color Color;
    public Vehicle()
    {
        length = 1; 
        width = 1;
        color = white ;
    }
    public Vehicle (int length,int width,Color Color) {
        this.length = length;
        this.width = width;
        this.Color = Color;
    }
}
