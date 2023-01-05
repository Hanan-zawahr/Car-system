import java.lang.String;
public enum FuelType {
    
    UNDEFINED(0),
    DEISEL(1),
    GASOLINE(2);
    
    private final int value;

    FuelType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
  
