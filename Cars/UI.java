import java.util.Scanner;
public class UI {
    public static void main (String args[]) {
        int select,x = 1;
        Scanner input = new Scanner (System.in);
        System.out.print ("***Welcome to car-system*** \n");
        System.out.print ("--------------------------- \n");
        System.out.print (" 1.Automobile \n 2.Engin \n 3.Motorcycle \n 4.Vehicle \n 5.Car \n 6.Truck \n please select from 1 to 6 \n");
        System.out.print ("====> ");
        select = input.nextInt();
            switch(select) {
                case 1 :{System.out.println(" Add automobile \n Display automobile \n Edit automobile \n Delet automobile \n");
                    break;}
                case 2 :{System.out.println(" Add engin \n Display engin \n Edit engin \n Delet engin \n");
                     break;}
                case 3 :{System.out.println(" Add motorcycle \n Display motorcycle \n Edit motorcycle \n Delet motorcycle \n");
                     break;}
                case 4 :{System.out.println(" Add vehicle \n Display vehicle \n Edit vehicle \n Delet vehicle \n");
                     break;}    
                case 5 :{System.out.println(" Add car \n Display car \n Edit car \n Delet car \n");
                     break;}    
                case 6 :{System.out.println(" Add truck \n Display truck \n Edit truck \n Delet truck \n");
                     break;}
                 default : System.out.println("Error,please try agin");
                 System.out.print ("--------------------------- \n");
    }
}
}