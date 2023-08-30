package Cars;

import Enums.ServiceCodes;
import Utility.Pair;

import java.util.HashMap;

public class HatchBack implements ICar {
  private HashMap<String, Pair>carServiceMap;
    public HatchBack(){
            carServiceMap = new HashMap<>();
            carServiceMap.put(ServiceCodes.BS01.name(),new Pair("Basic Servicing",2000));
            carServiceMap.put(ServiceCodes.BF01.name(),new Pair("Brake Fixing",1000));
            carServiceMap.put(ServiceCodes.CF01.name(),new Pair("Clutch Fixing",2000));
            carServiceMap.put(ServiceCodes.GF01.name(),new Pair("Gear Fixing",3000));
            carServiceMap.put(ServiceCodes.EF01.name(),new Pair("Engine Fixing",5000));

        }


    @Override
    public HashMap<String, Pair> serviceListPriceMap() {
        return  carServiceMap;
    }
}
