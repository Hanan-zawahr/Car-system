public class Car extends Vehicle {
    public int CHAIR_NUM;
    public boolean IS_FURNITRE_LEATHer; 
    public Car() {
        chair_num=0;
        is_furnitre_leather=false;
    }
    public Car (int chair_num,boolean is_furnitre_leather) {
        this.chair_num = chair_num;
        this.is_furnitre_leather = is_furnitre_leather;
    }
}
