package design.patterns.creationals.factory_method.challenge;

/**
 * @autor Andrés Velasquez
 * @since 2019-04-08
 **/
public class Client {

    public static void main(String[] args) {
        AnimalFactory animalFactory = new ConcreteFactory();

        Animal tiger = animalFactory.getAnimal("TIGER");

        tiger.walk(200);
    }
}
