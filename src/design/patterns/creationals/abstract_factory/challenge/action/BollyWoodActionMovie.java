package design.patterns.creationals.abstract_factory.challenge.action;

import design.patterns.creationals.abstract_factory.challenge.BollyWoodMovieInterface;

/**
 * @autor Andrés Velasquez
 * @since 2019-04-14
 **/
public class BollyWoodActionMovie implements BollyWoodMovieInterface {
    @Override
    public String getMovieName() {
        return "This Indian Movie is a Bollywood Action Movie ";
    }
}
