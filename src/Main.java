
import Utility.CarService;
import Utility.ServiceGenerator;

public class Main {
    public static void main(String[] args) {

        System.out.printf("%n*************************** Welcome To The Car Service Station ***************************%n%n");


        CarService carService = new CarService(new ServiceGenerator());

        carService.BillMaker();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        carService.billDisplay();

        System.out.println("\nProgram completed.");
    }


}

