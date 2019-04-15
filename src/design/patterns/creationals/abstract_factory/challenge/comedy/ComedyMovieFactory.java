package design.patterns.creationals.abstract_factory.challenge.comedy;

import design.patterns.creationals.abstract_factory.challenge.BollyWoodMovieInterface;
import design.patterns.creationals.abstract_factory.challenge.HollyWoodMovieInterface;
import design.patterns.creationals.abstract_factory.challenge.MovieFactoryInterface;

/**
 * @autor Andrés Velasquez
 * @since 2019-04-14
 **/
public class ComedyMovieFactory implements MovieFactoryInterface {
    @Override
    public HollyWoodMovieInterface getHollyWoodMovie() {
        return new HollyWoodComedyMovie();
    }

    @Override
    public BollyWoodMovieInterface getBollyWoodMovie() {
        return new BollyWoodComedyMovie();
    }
}
