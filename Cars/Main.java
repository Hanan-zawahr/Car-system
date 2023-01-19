import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //---------------------engineVar
        String manufacture;
        LocalDate engineManufactureDate = LocalDate.of(1970, 1, 1);
        String engineModel;
        int capacity;
        int cylinders;
        FuelType fuelType;
        String fuelTypeFromUser;
        int engineYear;
        int engineMonth;
        int engineDay;
        //----------------------automobileVar
        String manufactureCompany;
        LocalDate automobileManufactureDate = LocalDate.of(1970, 1, 1);
        String model;
        String plateNum;
        GearType gearType;
        String gearTypeFromUser;
        String bodySerailNum;
        int automobileYear;
        int automobileMonth;
        int automobileDay;
        //----------------------specialVar
        Object specialVar1;
        Object specialVar2;
        Object specialVar3;
        //----------------------list
        ArrayList<Car> carList = new ArrayList<>();
        ArrayList<Motorcycle> motorcycleList = new ArrayList<>();
        ArrayList<Truck> truckList = new ArrayList<>();
        String msg = "Welcome";
        //----------------------date
        String date = in.next();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");

        do {
            System.out.println(msg + "\n"
                + "please choose a no. from 1 to 3\n"
                + "1- Cars \n2- Motorcycle \n3- Trucks\n0- Exit ");//menu
            int chooseVehicle = in.nextInt();
            switch (chooseVehicle) {
                case 1: {//Car                   
                        System.out.println("please choose a no. from 1 to 4\n"
                            + "1- Add \n2- Delete \n3- Modify \n4- Search");
                        int choose = in.nextInt();
                        switch (choose) {
                            case '1': {//AddCar
                                    //---------------------engine
                                    System.out.print("enter the manufacture:");
                                    manufacture = in.next();
                                    System.out.println("enter the engine ManufactureDate: ");
                                    System.out.print("\t\tenter year");
                                    engineYear = in.nextByte();
                                    System.out.print("\t\tenter month");
                                    engineMonth = in.nextByte();
                                    System.out.print("\t\tenter day");
                                    engineDay = in.nextByte();
                                    System.out.print("enter the engine model: ");
                                    engineModel = in.next();
                                    System.out.print("enter the number of capacity: ");
                                    capacity = in.nextInt();
                                    System.out.print("Enter the number of cylinders:");
                                    cylinders = in.nextInt();
                                    System.out.print("Enter the fuel type:");
                                    fuelTypeFromUser = in.next();
                                    fuelType = fuelType(fuelTypeFromUser);
                                    //----------------------automobile
                                    System.out.print("Enter the name of the manufacture company:");
                                    manufactureCompany = in.next();
                                    System.out.print("Enter the date of the manufacture date:");
                                    System.out.print("\t\tenter year");
                                    automobileYear = in.nextByte();
                                    System.out.print("\t\tenter month");
                                    automobileMonth = in.nextByte();
                                    System.out.print("\t\tenter day");
                                    automobileDay = in.nextByte();
                                    System.out.print("Enter the model:");
                                    model = in.next();
                                    System.out.print("Enter the plate number:");
                                    plateNum = in.next();
                                    System.out.print("Enter the gear Type:");
                                    gearTypeFromUser = in.next();
                                    gearType = gearType(gearTypeFromUser);
                                    System.out.print("Enter the body sereail number:");
                                    bodySerailNum = in.next();
                                    // -- -- -- -- -- -- -- -- -- -- --vehicle
                                    System.out.print("Enter the length vehicle :");
                                    double length = in.nextDouble();
                                    System.out.print("Enter the width vehicle :");
                                    double width = in.nextDouble();
                                    System.out.print("Enter the color vehicle :");
                                    String color = in.next();
                                    //----------------------car
                                    System.out.print("Enter the number of the chairNum :");
                                    int chairNum = in.nextInt();
                                    System.out.print("Please answer with true or false if the car has FurnitreLeather? :");
                                    boolean isFurnitreLeather = in.nextBoolean();
                                    Engine engine = new Engine(manufacture, engineManufactureDate, engineModel, capacity, cylinders, fuelType);
                                    Car car = new Car(chairNum, isFurnitreLeather, length, width, color, manufactureCompany, automobileManufactureDate, model, engine, plateNum, gearType, bodySerailNum);
                                    carList.add(car);

                                }

                            default: {//else for car inputs
                                    System.out.println("\nWrong!..you have to just choose from 1 to 4...\n"
                                        + "Please try again");
                                }

                        }
                    }
            }
        } while (true);

    }

    //----------------------fuelType
    public FuelType fuelType(String value) {
        if (value.equals("D")   {
            value.equals("d")  
        }
        value.equals("diesel")  value.equals("Diesel")  value.equals("DIESEL")

        ) {
            return FuelType.DEISEL;
        }else if (value.equals("G")   {
            value.equals("g")  
        }
        value.equals("gasloin")  value.equals("Gasloin")  value.equals("GASOLINE")

        ) {
            return FuelType.GASOLINE;
        }else {
            System.out.println("Unrecognized option");
            return FuelType.UNDEFINED;
        }
    }
    //----------------------gearType
    public GearType gearType(String value) {
        if (value.equals("N")   {
            value.equals("n")  
        }
        value.equals("normal")  value.equals("Normal")  value.equals("NORMAL")

        ) {
            return GearType.NORMAL;
        }else if (value.equals("A")   {
            value.equals("a")  
        }
        value.equals("Automatic")  value.equals("automatic")  value.equals("AUTOMATIC")

        ) {
            return GearType.AUTOMATIC;
        }else {
            System.out.println("Unrecognized option");
            return GearType.UNDEFINED;
        }
    }
}
