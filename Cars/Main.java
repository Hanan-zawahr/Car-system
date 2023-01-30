import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    protected static Engine engine;
    protected static Automobile automobile;
    protected static Vehicle vehicle;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //-----------------------list
        ArrayList<Car> carList = new ArrayList<>();
        ArrayList<Motorcycle> motorcycleList = new ArrayList<>();
        ArrayList<Truck> truckList = new ArrayList<>();
        String msg = "Welcome";
        int chooseVehicle;
        do {
            System.out.println(msg + "\n" + "please choose a no.from 1 to 3\n" + "1- Cars \n2- Motorcycle \n3- Trucks \n0- Exit ");
            chooseVehicle = input.nextInt();
            switch (chooseVehicle) {
                case 0: {
                        System.out.println("  ******************* exit *******************");
                        break;
                    }
                case 1: {//car
                        System.out.println("please choose a no.from 1 to 5\n" + "1- Add \n2- Delete \n3- modify \n4- Search\n5- Show list of cars");
                        int choose = input.nextInt();
                        switch (choose) {
                            case 1: {//AddCar
                                    //-------------------engine
                                    engine = AddEngine();
                                    //---------------------automobile 
                                    automobile = AddAutomobile();
                                    //-------------------------vehicle
                                    vehicle = AddVehicle();
                                    //------------------------car
                                    Car car = AddCar();
                                    carList.add(car);
                                    carList.get(carList.size() - 1).print();
                                    break;
                                }
                            case 2: {//Delete car
                                    int err = 0;
                                    String bodySereailNum;
                                    System.out.print("enter the body sereail number :");
                                    bodySereailNum = input.next();
                                    for (int i = 0; i < carList.size(); i++) {
                                        if (carList.get(i).getBodySereailNum().contains(bodySereailNum)) {
                                            carList.remove(i);
                                            err = 1;
                                            System.out.println("Deleted successfully !!! ");
                                        }
                                    }
                                    if (err == 0) {
                                        System.out.println("No resulte found '_' ");
                                    }
                                    break;
                                }
                            case 3: {// modify car
                                    break;
                                }
                            case 4: {// Search car
                                    break;
                                }
                            case 5: {// Show list of cars
                                    int err = 0;
                                    for (int i = 0; i < carList.size(); i++) {
                                        System.out.print("---------------------- car " + (i + 1) + " -----------------------\n ");
                                        err = 1;
                                        carList.get(i).print();
                                    }
                                    if (err == 0) {
                                        System.out.println("No resulte found '_' ");
                                    }
                                    break;
                                }
                            default: {//else for car inputs
                                    System.out.println("\nWrong!..you have to just choose from 1 to 5...\n Please try again");
                                }

                        }
                        break;
                    }
                case 2: {// Motorcycle 
                        System.out.println("please choose a no.from 1 to 5\n" + "1- Add \n2- Delete \n3- modify \n4- Search\n5- Show list of Motorcycles");
                        int choose = input.nextInt();
                        switch (choose) {
                            case 1: {//Add Motorcycle
                                    //-------------------engine
                                    engine = AddEngine();
                                    //---------------------automobile 
                                    automobile = AddAutomobile();
                                    //------------------------Motorcycle
                                    Motorcycle motorcycle = AddMotorcycle();
                                    motorcycleList.add(motorcycle);
                                    motorcycleList.get(motorcycleList.size() - 1).print();

                                    break;
                                }
                            case 2: {//Delete Motorcycle
                                    String bodySereailNum;
                                    int err = 0;
                                    System.out.print("enter the body sereail number : ");
                                    bodySereailNum = input.next();
                                    for (int i = 0; i < motorcycleList.size(); i++) {
                                        if (motorcycleList.get(i).getBodySereailNum().contains(bodySereailNum)) {
                                            motorcycleList.remove(i);
                                            err = 1;
                                            System.out.println("Deleted successfully !!! ");
                                        }
                                    }
                                    if (err == 0) {
                                        System.out.println("No resulte found '_' ");
                                    }
                                    break;
                                }
                            case 3: {// modify Motorcycle
                                    break;
                                }
                            case 4: {// Search Motorcycle
                                    
                                }
                            case 5: {// Show list of Motorcycles
                                    int err = 0;
                                    for (int i = 0; i < carList.size(); i++) {
                                        System.out.print("---------------------- Motorcycle " + (i + 1) + " ----------------------\n ");
                                        err = 1;
                                        motorcycleList.get(i).print();
                                    }
                                    if (err == 0) {
                                        System.out.println("No resulte found '_' ");
                                    }
                                    break;
                                }
                            default: {//else for car inputs
                                    System.out.println("\nWrong!..you have to just choose from 1 to 5...\n" + "Please try again");
                                }

                        }
                        break;
                    }
                case 3: {// Trucks
                        System.out.println("please choose a no.from 1 to 5\n" + "1- Add \n2- Delete \n3- modify \n4- Search \n5- Show list of Trucks");
                        int choose = input.nextInt();
                        switch (choose) {
                            case 1: {//Add Truck
                                    //-------------------engine
                                    engine = AddEngine();
                                    //---------------------automobile 
                                    automobile = AddAutomobile();
                                    //-------------------------vehicle
                                    vehicle = AddVehicle();
                                    //------------------------Truck
                                    Truck truck = AddTruck();
                                    truckList.add(truck);
                                    truckList.get(truckList.size() - 1).print();
                                    System.out.print(truckList);
                                    break;
                                }
                            case 2: {//Delete Truck
                                    String bodySereailNum;
                                    int err = 0;
                                    System.out.print("enter the body sereail number : ");
                                    bodySereailNum = input.next();
                                    for (int i = 0; i < motorcycleList.size(); i++) {
                                        if (truckList.get(i).getBodySereailNum().contains(bodySereailNum)) {
                                            truckList.remove(i);
                                            err = 1;
                                            System.out.println("Deleted successfully !!! ");
                                        }
                                    }
                                    if (err == 0) {
                                        System.out.println("No resulte found '_' ");
                                    }
                                    break;
                                }
                            case 3: {// modify Truck
                                    break;
                                }
                            case 4: {// Search Truck
                                    break;
                                }
                            case 5: {// Show list of Trucks
                                    int err = 0;
                                    for (int i = 0; i < carList.size(); i++) {
                                        System.out.print("---------------------- Truck " + (i + 1) + " ----------------------\n ");
                                        err = 1;
                                        truckList.get(i).print();
                                    }
                                    if (err == 0) {
                                        System.out.println("No resulte found '_' ");
                                    }
                                    break;
                                }
                            default: {//else for car inputs
                                    System.out.println("\nWrong!..you have to just choose from 1 to 5...\n" + "Please try again");
                                }

                        }
                        break;
                    }

                default: {
                        System.out.println("\nWrong!..you have to just choose from 1 to 5...\n" + "Please try again");
                    }
            }

        } while (chooseVehicle != 0);
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

    public static Engine AddEngine() {
        Scanner input = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String manufacture;
        String engineManufactureDate;
        String engineModel;
        int capacity;
        int cylinders;
        FuelType fuelType;
        String fuelTypeFromUser;
        System.out.print("enter the manufacture :");
        manufacture = input.next();
        System.out.print("enter the engine manufacture date :");
        engineManufactureDate = input.next();
        Date newEngineManufactureDate = null;
        try {
            newEngineManufactureDate = sdf.parse(engineManufactureDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.print("enter the engine model :");
        engineModel = input.next();
        System.out.print("enter the number of capacitty :");
        capacity = input.nextInt();
        System.out.print("enter the number of cylinders :");
        cylinders = input.nextInt();
        System.out.print("enter the fuel type :");
        fuelTypeFromUser = input.next();
        fuelType = fuelType(fuelTypeFromUser);
        Engine engine = new Engine(manufacture, newEngineManufactureDate, engineModel, capacity, cylinders, fuelType);
        return engine;
    }

    public static Automobile AddAutomobile() {
        Scanner input = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");//simple date formate
        String manufactureCompany;
        String automobileManufactureDate;
        String model;
        String plateNum;
        GearType gearType;
        String gearTypeFromUser;
        String bodySereailNum;
        System.out.print("enter the name of the manufacture company :");
        manufactureCompany = input.next();
        System.out.print("enter the Automoblie manufacture date :");
        automobileManufactureDate = input.next();
        Date newAutomobileManufactureDate = null;
        try {
            newAutomobileManufactureDate = sdf.parse(automobileManufactureDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.print("enter the model :");
        model = input.next();
        System.out.print("enter the plate number :");
        plateNum = input.next();
        System.out.print("enter the gear type :");
        gearTypeFromUser = input.next();
        gearType = gearType(gearTypeFromUser);
        System.out.print("enter the body sereail number :");
        bodySereailNum = input.next();
        Automobile automobile = new Automobile(manufactureCompany, newAutomobileManufactureDate, model, engine, plateNum, gearType, bodySereailNum);

        return automobile;
    }

    public static Vehicle AddVehicle() {
        Scanner input = new Scanner(System.in);
        double length;
        double width;
        String color;
        System.out.print("enter the length vehicle :");
        length = input.nextDouble();
        System.out.print("enter the width vehicle :");
        width = input.nextDouble();
        System.out.print("enter the color vehicle :");
        color = input.next();
        Vehicle vehicle = new Vehicle(length, width, color, automobile.getManufactureCompany(), automobile.getManufactureDate(),
                automobile.getModel(), automobile.getEngine(), automobile.getPlateNum(),
                automobile.getGearType(), automobile.getBodySereailNum());
        return vehicle;
    }

    public static Car AddCar() {
        Scanner input = new Scanner(System.in);
        int chairNum;
        boolean isFurnitreleather;
        System.out.print("enter the number of the chairNum :");
        chairNum = input.nextInt();
        System.out.print("please answer with true or false if the car has furnitreleather? :");
        isFurnitreleather = input.nextBoolean();
        Car car = new Car(chairNum, isFurnitreleather, vehicle.getLength(), vehicle.getWidth(),
                vehicle.getColor(), vehicle.getManufactureCompany(),
                vehicle.getManufactureDate(), vehicle.getModel(), vehicle.getEngine(),
                vehicle.getPlateNum(), vehicle.getGearType(), vehicle.getBodySereailNum());
        return car;
    }

    public static Motorcycle AddMotorcycle() {
        Scanner input = new Scanner(System.in);
        double tierDiameter;
        double length;
        System.out.print("enter the number of the tierDiameter :");
        tierDiameter = input.nextDouble();
        System.out.print("enter the length vehicle :");
        length = input.nextDouble();
        Motorcycle motorcycle = new Motorcycle(tierDiameter, length, automobile.getManufactureCompany(), automobile.getManufactureDate(),
                automobile.getModel(), automobile.getEngine(), automobile.getPlateNum(),
                automobile.getGearType(), automobile.getBodySereailNum());
        return motorcycle;
    }

    public static Truck AddTruck() {
        Scanner input = new Scanner(System.in);
        double freeWeight;
        double fullWeight;
        System.out.print("enter the free weight :");
        freeWeight = input.nextDouble();
        System.out.print("enter the full weight  :");
        fullWeight = input.nextDouble();
        Truck truck = new Truck(freeWeight, fullWeight, vehicle.getLength(), vehicle.getWidth(),
                vehicle.getColor(), vehicle.getManufactureCompany(),
                vehicle.getManufactureDate(), vehicle.getModel(), vehicle.getEngine(),
                vehicle.getPlateNum(), vehicle.getGearType(), vehicle.getBodySereailNum());
        return truck;
    }
}