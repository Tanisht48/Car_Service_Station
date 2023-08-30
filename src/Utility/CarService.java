package Utility;

import Cars.HatchBack;

import Cars.SUV;
import Cars.Sedan;
import Enums.Car;

import java.util.ArrayList;
import java.util.Scanner;

public class CarService {
    private final String selectedCar;
    private final ArrayList<String>serviceCodes;
        public CarService(ServiceGenerator serviceGenerator)
        {
            Scanner sc = new Scanner(System.in);
            selectedCar = serviceGenerator.getSelectedCar(sc);
            serviceCodes = serviceGenerator.getServiceCodes(sc);
            sc.close();
        }



    public String getSelectedCar() {
        return selectedCar;
    }

    public ArrayList<String> getServiceCodes() {
        return serviceCodes;
    }

    private final BillGenerate billGenerate =new BillGenerate();
    public void BillMaker()
    {
        if(getSelectedCar().equals(Car.HatchBack.name())) billGenerate.billVariables(new HatchBack(),getServiceCodes());
        if(getSelectedCar().equals(Car.SUV.name())) billGenerate.billVariables(new SUV(),getServiceCodes());
        if(getSelectedCar().equals(Car.Sedan.name()))billGenerate.billVariables(new Sedan(),getServiceCodes());
    }
  public void billDisplay(){
        billGenerate.billDisplay();
  }
}
