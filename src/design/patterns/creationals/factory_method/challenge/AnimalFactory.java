package design.patterns.creationals.factory_method.challenge;


/**
 * @autor Andrés Velasquez
 * @since 2019-04-08
 **/
public abstract class AnimalFactory  {
    // user getShape method to get object of type shape

    public abstract Animal getAnimal(String animalType) ;
}
