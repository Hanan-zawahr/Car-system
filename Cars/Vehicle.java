import java.awt.Color;
public class Vehicle extends Automobile{
    public int length;
    public int width; 
    public Color color;
    public Vehicle(){
        length = 1; 
        width = 1;
        color = "";
    }
    public Vehicle(int length,int width,Color Color){
        this.length = length;
        this.width = width;
        this.color = color;
    }
}
