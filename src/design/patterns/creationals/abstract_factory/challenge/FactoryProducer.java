package design.patterns.creationals.abstract_factory.challenge;

import design.patterns.creationals.abstract_factory.challenge.action.ActionMovieFactory;
import design.patterns.creationals.abstract_factory.challenge.comedy.ComedyMovieFactory;

/**
 * @autor Andrés Velasquez
 * @since 2019-04-14
 **/
public class FactoryProducer {
    public static MovieFactoryInterface getFactory(String choice) {
        if (choice.equalsIgnoreCase("COMEDY")) {
            return new ComedyMovieFactory();
        } else if (choice.equalsIgnoreCase("ACTION")) {
            return new ActionMovieFactory();
        }
        return null;
    }
}
