import static java.lang.System.in;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Date;

public class Main {

    public void main(String[] args) {
        Scanner in = new Scanner(System.in);
        public String engineManufacture;
        public Date engineManufactureDate;
        public String engineModel;
        public int capacity;
        public int cylinders;
        public FuelType fuelType;
        //----------------------automobileVar
        public String manufactureCompany;
        public Date manufactureDate;
        public String model;
        public String platNum;
        public GearType gearType;
        public String bodySereailNum;
        //----------------------specialVar
        public Object specialVar1;
        public Object specialVar2;
        public Object specialVar3;
        //----------------------list
        ArrayList<Car> carList = new ArrayList<>();
        ArrayList<Motorcycle> motorcycleList = new ArrayList<>();
        ArrayList<Truck> truckList = new ArrayList<>();
        String msg = "Welcome";
        //----------------------date
        String date = in.next();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");
        //----------------------fuelType
        public FuelType fuelType(String value) {
        if (value.equals("D") || value.equals("d") || value.equals("diesel") || value.equals("Diesel") || value.equals("DIESEL")) {
            return FuelType.DEISEL;
        } else if (value.equals("G") || value.equals("g") || value.equals("gasloin") || value.equals("Gasloin") || value.equals("GASOLINE")) {
            return FuelType.GASOLINE;
        } else {
            System.out.println("Unrecognized option");
            return FuelType.UNDEFINED;
        }
    }

    public GearType gearType(String value) {
        if (value.equals("N") || value.equals("n") || value.equals("normal") || value.equals("Normal") || value.equals("NORMAL")) {
            return GearType.NORMAL;
        } else if (value.equals("A") || value.equals("a") || value.equals("Automatic") || value.equals("automatic") || value.equals("AUTOMATIC")) {
            return GearType.AUTOMATIC;
        } else {
            System.out.println("Unrecognized option");
            return GearType.UNDEFINED;
        }

    }

    do {
        System.out.println(msg + "\n"
            + "please choose a no. from 1 to 3\n"
            + "1- Cars \n2- Motorcycle \n3- Trucks\n0- Exit ");//menu
        char chooseVehicle = in.next().charAt(0);
        switch (chooseVehicle) {
            case '1': {//Car                   
                    System.out.println("please choose a no. from 1 to 4\n"
                        + "1- Add \n2- Delete \n3- Modify \n4- Search");
                    char choose = in.next().charAt(0);
                    switch (choose) {
                        case '1': {//AddCar
                                //---------------------engine
                                System.out.print("enter the manufacture:");
                                manufacture = in.next();
                                System.out.print("enter the engine ManufactureDate: ");
                                Date engineManufactureDate = null;
                                try {
                                    engineManufactureDate = dateFormat.parse(date);
                                } catch (parseException e) {
                                    e.printStackTrace();
                                }
                                System.out.print("enter the engine model: ");
                                engineModel = in.next();
                                System.out.print("enter the number of capacity: ");
                                capacity = in.nextInt();
                                System.out.print("Enter the number of cylinders:");
                                cylinders = in.nextInt();
                                System.out.print("Enter the fuel type:");
                                fuelType = in.next();    
                                //----------------------automobile
                                System.out.print("Enter the name of the manufacture company:");
                                manufactureCompany = in.next();
                                System.out.print("Enter the date of the manufacture date:");
                                Date manufactureDate = null;
                                try {
                                    manufactureDate = dateFormat.parse(date);
                                } catch (parseException e) {
                                    e.printStackTrace();
                                }
                                System.out.print("Enter the model:");
                                model = in.next();
                                System.out.print("Enter the plate number:");
                                platNum = in.next();
                                System.out.print("Enter the gear Type:");
                                gearType = in.next();      
                                System.out.print("Enter the body sereail number:");
                                bodySereailNum = in.next();
                                //----------------------vehicle
                                System.out.print("Enter the length vehicle :");
                                double length = in.nextDouble();
                                System.out.print("Enter the width vehicle :");
                                double wigth = in.nextDouble();
                                System.out.print("Enter the color vehicle :");
                                String color = in.next();
                                //----------------------car
                                System.out.print("Enter the number of the chairNum :");
                                String chairNum = in.next();
                                System.out.print("Please answer with true or false if the car has FurnitreLeather? :");
                                boolean isFurnitreLeather = in.nextBoolean();

                                Car car = new Car(manufactureCompany,manufactureDate, model, platNum, gearType, bodySereailNum,engine,chairNum,isFurnitreLeather,
                                        length,width,color);
                                Engine engine = new engine(engineManufacture, engineManufactureDate, engineModel, capacity, cylinders, fuelType);
                                carList.add(car);
                                car.flush();
                            }
                        case '2': {//deleteCar
                                System.out.println("Enter the bodySerailNum of the car you want to delete: ");
                                bodySerailNum = scanner.nextInt();
                                for (int i = 0; i < carList.size(); i++) {
                                    if (carList.get(i).getBodySerailNum() == bodySerailNum) {
                                        carList.remove(i);
                                        System.out.println(" car with bodySerailNum " + bodySerailNum + " has been deleted from the list.");
                                        return;
                                    }
                                }
                                System.out.println("Vehicle not found");
                            }
                        case '3':{//modifyCar
                                String serialNum = new Car().modify(in);
                                for(int i=0;i<carList.size();i++){
                                    if(carList.get(i).getBodySerailNum().equals(serialNum)){
                                        carList.set(i,new car());
                                    }
                                    else
                                        System.out.println("Not Found");
                                }
                            }

                        default: {//else for car inputs
                                System.out.println("\nWrong!..you have to just choose from 1 to 4...\n"
                                    + "Please try again");
                            }
                            break;
                    }

                }
        }while (true);
    }
}
