public class Car extends Vehicle{
    public int CHAIR_NUM;
    public boolean IS_FURNITRE_LEATHer; 
    public Car(){
        CHAIR_NUM = 5;
        IS_FURNITRE_LEATHer = false;
    }
    public Car(int chair_num,boolean is_furnitre_leather){
        this.CHAIR_NUM = chair_num;
        this.IS_FURNITRE_LEATHer = is_furnitre_leather;
    }
}
