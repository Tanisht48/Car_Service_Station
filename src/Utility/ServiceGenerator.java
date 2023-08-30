package Utility;

import Enums.Car;
import Enums.ServiceCodes;
import java.util.ArrayList;
import java.util.Scanner;

public class ServiceGenerator {

    public ServiceGenerator()
        {
            Scanner sc = new Scanner(System.in);
        }

    public  String getSelectedCar(Scanner sc) {
        System.out.println("Please enter 1, 2, or 3 to indicate the type of car you have:");
        System.out.println("1. Hatchback");
        System.out.println("2. Sedan");
        System.out.println("3. SUV");
        int selectCar = sc.nextInt();
        Car car = Car.getEnumFromInteger(selectCar);
        return car.toString();
    }

   public ArrayList<String> getServiceCodes(Scanner sc) {
        System.out.println("Please enter the number corresponding to the service you want:");
        System.out.println("1. Basic Servicing");
        System.out.println("2. Engine Fixing");
        System.out.println("3. Clutch Fixing");
        System.out.println("4. Brake Fixing");
        System.out.println("5. Gear Fixing");
        System.out.println("6. Exit");
        ArrayList<String>serviceCodes = new ArrayList<>();
        boolean select = true;
        int count = 0;
        while(select){
            int selectService = sc.nextInt();
            switch (selectService) {
                case 1 -> {
                    if (!serviceCodes.contains(ServiceCodes.BS01.toString())) {
                        serviceCodes.add(ServiceCodes.BS01.toString());
                        count++;
                    } else {
                        System.out.println("Service already added.");
                    }
                }
                case 2 -> {
                    if (!serviceCodes.contains(ServiceCodes.EF01.toString())) {
                        serviceCodes.add(ServiceCodes.EF01.toString());
                        count++;
                    } else {
                        System.out.println("Service already added.");
                    }
                }
                case 3 -> {
                    if (!serviceCodes.contains(ServiceCodes.CF01.toString())) {
                        serviceCodes.add(ServiceCodes.CF01.toString());
                        count++;
                    } else {
                        System.out.println("Service already added.");
                    }
                }
                case 4 -> {
                    if (!serviceCodes.contains(ServiceCodes.BF01.toString())) {
                        serviceCodes.add(ServiceCodes.BF01.toString());
                        count++;
                    } else {
                        System.out.println("Service already added.");
                    }
                }
                case 5 -> {
                    if (!serviceCodes.contains(ServiceCodes.GF01.toString())) {
                        serviceCodes.add(ServiceCodes.GF01.toString());
                        count++;
                    } else {
                        System.out.println("Service already added.");
                    }
                }
                case 6 -> select = false;
                default -> System.out.println("Enter a valid number");
            }
            if(count==5)
            {
                System.out.println("Service Limit Reached");
                select = false;
            }
        }
        return serviceCodes;
    }
}
