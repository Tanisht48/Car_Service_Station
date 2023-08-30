package Utility;

import Cars.ICar;

import java.util.ArrayList;
import java.util.HashMap;

public class BillGenerate {

    private ArrayList<String>serviceCodes;
    private HashMap <String,Pair>hm;

    private String selectedCar;


    public void billVariables(ICar iCar, ArrayList<String>serviceCodes)
    {
        this.serviceCodes = serviceCodes;
        hm = iCar.serviceListPriceMap();
        selectedCar = iCar.getClass().getName().substring(5);
    }


    public int billCalculator()
    {
        int total = 0;

        for(String i : serviceCodes)
        {
            Pair p = hm.get(i);
            total+=p.serviceCost();
        }

        return total;
    }

    public void billDisplay() {

        System.out.println("The Car Serviced: "+selectedCar);
        if(serviceCodes.size()==0){
            System.out.println("Please Select Services you Want");
            return;
        }
        System.out.print("The Service Codes are: ");
        for(int i=0;i<serviceCodes.size()-1;i++)
        {
            System.out.print(serviceCodes.get(i)+", ");
        }
        System.out.print(serviceCodes.get(serviceCodes.size()-1)+".\n");
        System.out.printf("%n");
        for(String i : serviceCodes)
        {
            Pair p = hm.get(i);
            System.out.printf("Charges for %s - ₹ %d%n", p.serviceName(), p.serviceCost());
        }
        System.out.printf("Total Bill -₹ %d%n", billCalculator());
        String billSummary ="Thank you for choosing our services!";
        if(billCalculator()>10000)
        {
            billSummary+=" As your total bill is above ₹ 10,000, a complimentary cleaning service is included.";
        }
        System.out.printf("%n");
        System.out.println(billSummary);
    }
}
