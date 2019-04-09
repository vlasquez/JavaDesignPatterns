package design.patterns.creationals.factory_method.challenge;

/**
 * @autor Andrés Velasquez
 * @since 2019-04-08
 **/
public class ConcreteFactory extends AnimalFactory {

    @Override
    public Animal getAnimal(String animalType) {
        if (animalType.isEmpty()) {
            return null;
        } else if (animalType.equalsIgnoreCase("DUCK")) {
            return new Duck();
        } else if (animalType.equalsIgnoreCase("TIGER")) {
            return new Tiger();
        }
        return null;
    }
}
