import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       
        Scanner in = new Scanner(System.in);
        ArrayList<Car> carList = new ArrayList<>();
        ArrayList<Motorcycle> motorcycleList = new ArrayList<>();
        ArrayList<Truck> truckList = new ArrayList<>();
        String msg = "Welcome";
        char chooseVehicle;

        do {
            System.out.println(msg + "\n "
                    + "please choose a no. from 1 to 3\n"
                    + "1- Cars \n2- Motorcycle \n3- Trucks\n0- Exit ");

            chooseVehicle = in.next().charAt(0);

            switch (chooseVehicle) {

                case '1': {//Car
                    System.out.println("please choose a no. from 1 to 4\n"
                            + "1- Add \n2- Delete \n3- Modify \n4- Search");
                    char choose;

                    choose = in.next().charAt(0);
                    switch (choose) {
                        case '1': {//Add
                            Car car = new Car();
                            car.add(in);
                            carList.add(car);
                            System.out.println("Added");
                            break;
                        }
                        case '2': {//Delete
                            String BodySerialNum = new Car().delete(in);
                            for (int i = 0; i < carList.size(); i++) {
                                if (carList.get(i).getBodySerailNum().equals(BodySerialNum)) {
                                    carList.remove(i);
                                    System.out.println("Deleted");
                                } else {
                                    System.out.println("Not Found");
                                }
                            }
                            break;
                        }
                        case '3': {//Modify
                            String serialNum = new Car().modify(in);
                            for (int i = 0; i < carList.size(); i++) {
                                if (carList.get(i).getBodySerailNum().equals(serialNum)) {
                                
                                    carList.set(i, new Car());
                                } else {
                                    System.out.println("Not Found");
                                }
                            }
                            break;
                        }
                        case '4': {//Search
                            System.out.println("Choose how to search\n1- Manufacture Name \n2-Manufacture Date \n3-plate num ");
                            char chooseSearch = in.next().charAt(0);
                            Car car = new Car();
                            switch (chooseSearch) {
                                case '1': {//Manufacture Name
                                    String manufactureName = in.next();
                                    for (int i = 0; i < carList.size(); i++) {
                                        if (carList.get(i).getManufactureCompany().equals(manufactureName)) {
                                            car.printAll();
                                        } else {
                                            System.out.println("Not Found");
                                        }
                                    }
                                }
                                case '2': {//Manufacture Date
                                    break;
                                }
                                case '3': {//plate num

                                }
                                default: {
                                }
                            }

                            break;
                        }
                        default: {
                            System.out.println("\nWrong!..you have to just choose from 1 to 4...\n" + "Please try again");
                        }
                    }
                    break;
                }
                case '2': {//Motorcycle
                    System.out.println("please choose a no. from 1 to 4\n"
                            + "1- Add \n2- Delete \n3- Modify \n4- Search");
                    char choose;

                    choose = in.next().charAt(0);
                    switch (choose) {
                        case '1': {//Add
                            Motorcycle motorcycle = new Motorcycle();
                            motorcycle.add(in);
                            motorcycleList.add(motorcycle);
                            System.out.println("Added");
                            break;
                        }
                        case '2': {//Delete
                            String BodySerialNum = new Motorcycle().delete(in);
                            for (int i = 0; i < motorcycleList.size(); i++) {
                                if (motorcycleList.get(i).getBodySerailNum().equals(BodySerialNum)) {
                                    motorcycleList.remove(i);
                                    System.out.println("Deleted");
                                } else {
                                    System.out.println("Not Found");
                                }
                            }
                            break;
                        }
                        case '3': {//Modify
                            String serialNum = new Motorcycle().modify(in);
                            for (int i = 0; i < motorcycleList.size(); i++) {
                                if (motorcycleList.get(i).getBodySerailNum().equals(serialNum)) {
                                
                                    motorcycleList.set(i, new Motorcycle());
                                } else {
                                    System.out.println("Not Found");
                                }
                            }
                            break;
                        }
                        case '4': {//Search
                            System.out.println("Choose how to search\n1- Manufacture Name \n2-Manufacture Date \n3-plate num ");
                            char chooseSearch = in.next().charAt(0);
                            Motorcycle motorcycle = new Motorcycle();
                            switch (chooseSearch) {
                                case '1': {//Manufacture Name
                                    String manufactureName = in.next();
                                    for (int i = 0; i < motorcycleList.size(); i++) {
                                        if (motorcycleList.get(i).getManufactureCompany().equals(manufactureName)) {
                                            motorcycle.printAll();
                                        } else {
                                            System.out.println("Not Found");
                                        }
                                    }
                                }
                                case '2': {//Manufacture Date
                                    break;
                                }
                                case '3': {//plate num

                                }
                                default: {
                                }
                            }

                            break;
                        }
                        default: {
                            System.out.println("\nWrong!..you have to just choose from 1 to 4...\n" + "Please try again");
                        }
                    }
                    break;
                }
                case '3': {//Truck
                    System.out.println("please choose a no. from 1 to 4\n"
                            + "1- Add \n2- Delete \n3- Modify \n4- Search");
                    char choose;

                    choose = in.next().charAt(0);
                    switch (choose) {
                        case '1': {//Add
                            Truck truck = new Truck();
                            truck.add(in);
                            truckList.add(truck);
                            System.out.println("Added");
                            break;
                        }
                        case '2': {//Delete
                            String BodySerialNum = new Truck().delete(in);
                            for (int i = 0; i < truckList.size(); i++) {
                                if (truckList.get(i).getBodySerailNum().equals(BodySerialNum)) {
                                    truckList.remove(i);
                                    System.out.println("Deleted");
                                } else {
                                    System.out.println("Not Found");
                                }
                            }
                            break;
                        }
                        case '3': {//Modify
                            String serialNum = new Truck().modify(in);
                            for (int i = 0; i < truckList.size(); i++) {
                                if (truckList.get(i).getBodySerailNum().equals(serialNum)) {
                                
                                    truckList.set(i, new Truck());
                                } else {
                                    System.out.println("Not Found");
                                }
                            }
                            break;
                        }
                        case '4': {//Search
                            System.out.println("Choose how to search\n1- Manufacture Name \n2-Manufacture Date \n3-plate num ");
                            char chooseSearch = in.next().charAt(0);
                            Truck truck = new Truck();
                            switch (chooseSearch) {
                                case '1': {//Manufacture Name
                                    String manufactureName = in.next();
                                    for (int i = 0; i < truckList.size(); i++) {
                                        if (truckList.get(i).getManufactureCompany().equals(manufactureName)) {
                                            truck.printAll();
                                        } else {
                                            System.out.println("Not Found");
                                        }
                                    }
                                }
                                case '2': {//Manufacture Date
                                    break;
                                }
                                case '3': {//plate num

                                }
                                default: {
                                }
                            }

                            break;
                        }
                        default: {
                            System.out.println("\nWrong!..you have to just choose from 1 to 4...\n" + "Please try again");
                        }
                    }
                    
                    break;
                }

                case '0': {//Exit
                    System.out.println("Bye");
                    System.exit(0);
                    break;
                }
                default: {
                    System.out.println("\nWrong!..you have to just choose from 1 to 3...\n"
                            + "Please try again");
                    msg = "";
                }
            }
        } while (true);

    }

}