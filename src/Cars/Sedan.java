package Cars;

import Enums.ServiceCodes;
import Utility.Pair;

import java.util.HashMap;

public class Sedan implements ICar{
    HashMap<String, Pair> carServiceMap;
    public Sedan(){
        carServiceMap = new HashMap<>();
        carServiceMap.put(ServiceCodes.BS01.name(),new Pair("Basic Servicing",4000));
        carServiceMap.put(ServiceCodes.BF01.name(),new Pair("Brake Fixing",1500));
        carServiceMap.put(ServiceCodes.CF01.name(),new Pair("Clutch Fixing",4000));
        carServiceMap.put(ServiceCodes.GF01.name(),new Pair("Gear Fixing",6000));
        carServiceMap.put(ServiceCodes.EF01.name(),new Pair("Engine Fixing",8000));

    }

    @Override
    public HashMap<String, Pair> serviceListPriceMap() {
        return carServiceMap;
    }
}
