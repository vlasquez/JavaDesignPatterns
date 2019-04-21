package design.patterns.creationals.prototype.challenge;

import design.patterns.creationals.prototype.challenge.car.Ford;
import design.patterns.creationals.prototype.challenge.car.Renault;

import java.util.Hashtable;

/**
 * @autor Andrés Velasquez
 * @since 2019-04-21
 **/
public class CarCached {
    private static Hashtable<String, BasicCar> basicCarHashtable = new Hashtable<>();

    public static BasicCar getCar(String carName) throws CloneNotSupportedException {
        BasicCar cachedCar = basicCarHashtable.get(carName);
        return (BasicCar) cachedCar.clone();
    }

    public static void loadCache() {
        BasicCar renault = new Renault("Renault");
        renault.price = 1000000;
        basicCarHashtable.put("Renault", renault);

        BasicCar ford = new Ford("Ford");
        ford.price = 123456;
        basicCarHashtable.put("Ford", ford);
    }
}

