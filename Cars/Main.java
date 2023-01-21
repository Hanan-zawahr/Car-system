import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //----------------------engineVar
        String manufacture;
        String engineManufactureDate;
        String engineModel;
        int capacity;
        int cylinders;
        FuelType fuelType;
        String fuelTypeFromUser;
        //-----------------------automobileVar
        String manufactureCompany;
        String automobileManufactureDate;
        String model;
        String plateNum;
        GearType gearType;
        String gearTypeFromUser;
        String bodySereailNum;
        //simple date formate
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        //-----------------------specialVar
        Object specialVar1;
        Object specialVar2;
        Object specialVar3;
        //-----------------------list
        ArrayList<Car> carList = new ArrayList<>();
        ArrayList<Motorcycle> motorcycleList = new ArrayList<>();
        ArrayList<Truck> truckList = new ArrayList<>();
        String msg = "Welcome";
        do {
            System.out.println(msg + "\n" + "please choose a no.from 1 to 3\n" + "1- Cars \n2- Motorcycle \n3- Trucks\n0- Exit ");
            int chooseVehicle = in.nextInt();
            switch (chooseVehicle) {
                case 1: {//car
                    System.out.println("please choose a no.from 1 to 4\n" + "1- Add \n2- Delete \n3- modify \n4- Search");
                    int choose = in.nextInt();
                    switch (choose) {
                        case 1: {//AddCar
                            //-------------------engine
                            System.out.print("enter the manufacture :");
                            manufacture = in.next();
                            System.out.print("enter the engine manufacture date :");
                            engineManufactureDate = in.next();
                            Date newEngineManufactureDate = null;
                            try {
                                newEngineManufactureDate = sdf.parse(engineManufactureDate);
                            } catch (ParseException e) {
                                e.printStackTrace();
                            }
                            System.out.print("enter the engine model :");
                            engineModel = in.next();
                            System.out.print("enter the number of capacitty :");
                            capacity = in.nextInt();
                            System.out.print("enter the number of cylinders :");
                            cylinders = in.nextInt();
                            System.out.print("enter the fuel type :");
                            fuelTypeFromUser = in.next();
                            fuelType = fuelType(fuelTypeFromUser);
                            //---------------------automoblie 
                            System.out.print("enter the name of the manufacture company :");
                            manufactureCompany = in.next();
                            System.out.print("enter the Automoblie manufacture date :");
                            automobileManufactureDate = in.next();
                            Date newAutomobileManufactureDate = null;
                            try {
                                newAutomobileManufactureDate = sdf.parse(automobileManufactureDate);
                            } catch (ParseException e) {
                                e.printStackTrace();
                            }
                            System.out.print("enter the model :");
                            model = in.next();
                            System.out.print("enter the plate number :");
                            plateNum = in.next();
                            System.out.print("enter the gear type :");
                            gearTypeFromUser = in.next();
                            gearType = gearType(gearTypeFromUser);
                            System.out.print("enter the body sereail number :");
                            bodySereailNum = in.next();
                            //-------------------------vehicle
                            System.out.print("enter the length vehicle :");
                            double length = in.nextDouble();
                            System.out.print("enter the width vehicle :");
                            double width = in.nextDouble();
                            System.out.print("enter the color vehicle :");
                            String color = in.next();
                            //------------------------car
                            System.out.print("enter the number of the chairNum :");
                            int chairNum = in.nextInt();
                            System.out.print("please answer with true or false if the car has furnitreleather? :");
                            boolean isFurnitreleather = in.nextBoolean();

                            Engine engine = new Engine(manufacture, newAutomobileManufactureDate, engineModel, capacity, cylinders, fuelType);
                            Car car = new Car(chairNum, isFurnitreleather, length, width, color, manufactureCompany, newEngineManufactureDate, model, engine, plateNum, gearType, bodySereailNum);
                            carList.add(car);
                            printAll(carList);
                            break;
                            //flush();
                        }
                        default: {//else for car inputs
                            System.out.println("\nWrong!..you have to just choose from 1 to 4...\n" + "Please try again");
                        }

                    }
                    
                }
                //default first switch
            }

        } while (true);
    }

    //-------------------------------fuelType
    public static FuelType fuelType(String value) {
        if (value.equals("D") || value.equals("d") || value.equals("deisel") || value.equals("Deisel") || value.equals("DEISEL")) {
            return FuelType.DEISEL;
        } else if (value.equals("G") || value.equals("g") || value.equals("gasoline") || value.equals("Gasoline") || value.equals("GASOLINE")) {
            return FuelType.GASOLINE;
        } else {
            System.out.println("Unrecognized option");
            return FuelType.UNDEFINED;
        }
    }

    //---------------------------gearType
    public static GearType gearType(String value) {
        if (value.equals("N") || value.equals("n") || value.equals("normal") || value.equals("Normal") || value.equals("NORMAL")) {
            return GearType.NORMAL;
        } else if (value.equals("A") || value.equals("a") || value.equals("automatic") || value.equals("Automatic") || value.equals("AUTOMATIC")) {
            return GearType.AUTOMATIC;
        } else {
            System.out.print("Unrecognized option");
            return GearType.UNDEFINED;
        }
    }
    public static void printAll(ArrayList<Car> carList ){
        for (String str : carList){
            System.out,print(str);
        }
    }
}
