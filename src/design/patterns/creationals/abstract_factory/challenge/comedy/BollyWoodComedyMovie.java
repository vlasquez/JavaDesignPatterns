package design.patterns.creationals.abstract_factory.challenge.comedy;

import design.patterns.creationals.abstract_factory.challenge.BollyWoodMovieInterface;

/**
 * @autor Andrés Velasquez
 * @since 2019-04-14
 **/
public class BollyWoodComedyMovie implements BollyWoodMovieInterface {
    @Override
    public String getMovieName() {
        return "This Indian Movie is a Comedy Movie";
    }
}
