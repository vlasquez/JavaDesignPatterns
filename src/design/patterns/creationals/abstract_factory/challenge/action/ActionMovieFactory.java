package design.patterns.creationals.abstract_factory.challenge.action;

import design.patterns.creationals.abstract_factory.challenge.*;

/**
 * @autor Andrés Velasquez
 * @since 2019-04-14
 **/
public class ActionMovieFactory implements MovieFactoryInterface {
    @Override
    public HollyWoodMovieInterface getHollyWoodMovie() {
        return new HollyWoodActionMovie();
    }

    @Override
    public BollyWoodMovieInterface getBollyWoodMovie() {
        return new BollyWoodActionMovie();
    }
}
