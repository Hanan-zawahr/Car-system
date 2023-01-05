import java.util.ArrayList;
import java.util.Scanner;
import java.util.Date;

public class Main {
  
    public static void main(String[] args) {
        
         Scanner in = new Scanner(System.in);//scanner for input
        ArrayList<Car> carList = new ArrayList<>();//list of car
        ArrayList<Motorcycle> motorcycleList = new ArrayList<>();//list of motorcycle
        ArrayList<Truck> truckList = new ArrayList<>();//list of truck
        
        String msg = "Welcome";//to can change a message
        char chooseVehicle;//to choose the vehicle
        //---------------------engine
        String manufacture = new manufacture();
        Date engineManufactureDate = new engineManufactureDate();
        String engineModel = new engineModel();
        int capacity = new capacity();
        int cylinders = new cylinders();
        FuelType fuelType = new fuelType();
        //----------------------automobile
        String manufactureCompany=new manufactureCompany();
        Date manufactureDate = new manufactureDate();
        String model = new model();
        String plateNum = new plateNum();
        GearType gearType = new gearType();
        String bodySerailNum = new bodySereailNum();
        //------------------------vehicle
        double length = new length();
        double width = new width();
        String color = new color();
        
        do {
            System.out.println(msg + "\n"
                    + "please choose a no. from 1 to 3\n"
                    + "1- Cars \n2- Motorcycle \n3- Trucks\n0- Exit ");//menu
            
            chooseVehicle = in.next().charAt(0);
            
            switch (chooseVehicle) {
                
                case '1': {//Car                   
                    System.out.println("please choose a no. from 1 to 4\n"
                            + "1- Add \n2- Delete \n3- Modify \n4- Search");
                               char choose;//to choose add,delete,modify,search
                    choose = in.next().charAt(0);
                    switch (choose) {
                    case '1': {//AddCar
                            //---------------------engine
                            System.out.print("enter the manufacture:"); 
                            manufacture = in.next();
                            System.out.print("enter the engine ManufactureDate: ");
                            engineManufactureDate = in.nextDate();
                            System.out.print("enter the engine model: ");
                            engineModel = in.next();
                            System.out.print("enter the number of capacity: ");
                            capacity = in.nextInt();
                            System.out.print("Enter the number of cylinders:");
                            cylinders = in.nextInt();
                            //fuelType = in.next();
                            //----------------------automobile
                            System.out.print("Enter the name of the manufacture company:");
                            manufactureCompany = in.next();
                            System.out.print("Enter the date of the manufacture date:");
                            manufactureDate = in.nextDate();
                            System.out.print("Enter the model:");
                            model = in.next();
                            System.out.print("Enter the plate number:");
                            plateNum = in.next();
                            //gearType = in.next();
                            bodySereailNum = in.next();
                            //----------------------vehicle
                            System.out.print("Enter the length vehicle :");
                            length = in.nextDouble();
                            System.out.print("Enter the width vehicle :");
                            wigth = in.nextdouble();
                            System.out.print("Enter the color vehicle :");
                            color = in.next();
                            //----------------------car
                            System.out.print("Enter the number of the chairNum :");
                            chairNum = in.next();
                            System.out.print("Please answer with true or false if the car has FurnitreLeather? :");
                            isFurnitreLeather = in.nextBoolean();
                            
                            Car car = new Car(1.0,1.0,manufactureCompany,"01-01-1097","Model","engine",1);
                            Engine engine = new engine(manufacture,"01-01-1097",engineModel,0,4,1);
                            
                            carList.add(car);
                            
                            flush();
                            String manufacture = "not specified";
                            Date engineManufactureDate = new Date(1 - 1 - 1970);
                            String engineModel = "not specified";
                            int capacity = 0;
                            int cylinders = 4;
                            FuelType fuelType = FuelType.UNDEFINED;
                            String manufactureCompany = "not specified";
                            Date manufactureDate = new Date(1 - 1 - 1970);
                            String model = "not specified";
                            String plateNum = "not appointed";
                            GearType gearType = GearType.UNDEFINED;
                            String bodySerailNum = "not appointed";
                    }
                    case '2':{//delete
                    System.out.println("Enter the bodySerailNum of the car you want to delete: ");
                    for (int i = 0; i < motorcycleList.size(); i++) {
                    if (motorcycleList.get(i).getBodySerailNum() == bodySerailNum) {
                    motorcycleList.remove(i);
                    System.out.println(" motorcycle with bodySerailNum " + bodySerailNum + " has been deleted from the list.");
                    }
                    } 
                    break;
                }
                
                case '2': {//Motorcycle
                    System.out.println("please choose a no. from 1 to 4\n"
                            + "1- Add \n2- Delete \n3- Modify \n4- Search");
                               char choose;//to choose add,delete,modify,search
                    choose = in.next().charAt(0);
                    switch (choose) {
                        case '1': {//AddMotorcycle
                            //---------------------engine
                            System.out.print("enter the manufacture:"); 
                            manufacture = in.next();
                            System.out.print("enter the engine ManufactureDate: ");
                            engineManufactureDate = in.nextDate();
                            System.out.print("enter the engine model: ");
                            engineModel = in.next();
                            System.out.print("enter the number of capacity: ");
                            capacity = in.nextInt();
                            System.out.print("Enter the number of cylinders:");
                            cylinders = in.nextInt();
  
                            //----------------------automobile
                            System.out.print("Enter the name of the manufacture company:");
                            manufactureCompany = in.next();
                            System.out.print("Enter the date of the manufacture date:");
                            manufactureDate = in.nextDate();
                            System.out.print("Enter the model:");
                            model = in.next();
                            System.out.print("Enter the plate number:");
                            plateNum = in.next();
                            //gearType = in.next();
                            bodySereailNum = in.next();
                            //----------------------motorcycle
                            System.out.print("Enter the tier diameter Motorcycle");
                            tierDiameter = in.nextDouble();
                            System.out.print("Enter the length Motorcycle");
                            length = in.nextDouble();
                            
                            Motorcycle motorcycle = new Motocycle(1.0,1.0,manufactureCompany,"01-01-1097",Model,engine,1);
                            Engine engine = new engine(manufacture,"01-01-1097",engineModel,0,4,1);
                            motorcycleList.add(motorcycle);
                            
                            flush();
                            String manufacture = "not specified";
                            Date engineManufactureDate = new Date(1 - 1 - 1970);
                            String engineModel = "not specified";
                            int capacity = 0;
                            int cylinders = 4;
                            FuelType fuelType = FuelType.UNDEFINED;
                            String manufactureCompany = "not specified";
                            Date manufactureDate = new Date(1 - 1 - 1970);
                            String model = "not specified";
                            String plateNum = "not appointed";
                            GearType gearType = GearType.UNDEFINED;
                            String bodySerailNum = "not appointed";
                    }
                    case '2':{//delete
                    System.out.println("Enter the bodySerailNum of the car you want to delete: ");
                    for (int i = 0; i < motorcycleList.size(); i++) {
                    if (motorcycleList.get(i).getBodySerailNum() == bodySerailNum) {
                    motorcycleList.remove(i);
                    System.out.println(" motorcycle with bodySerailNum " + bodySerailNum + " has been deleted from the list.");
                    }
                    }  
                    break;
                }
                case '3': {//Truck
                    
                    break;
                }
              
                    case '0':{//Exit
                        System.out.println("Bye");
                            System.exit(0);
                            break;
                        }
                default: {//else for vehicles
                    System.out.println("\nWrong!..you have to just choose from 1 to 3...\n"
                            + "Please try again");
                    msg = "";
                }
            }
        } while (true);

    }
    }