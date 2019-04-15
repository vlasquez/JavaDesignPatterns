package design.patterns.creationals.abstract_factory.challenge.action;

import design.patterns.creationals.abstract_factory.challenge.HollyWoodMovieInterface;

/**
 * @autor Andrés Velasquez
 * @since 2019-04-14
 **/
public class HollyWoodActionMovie implements HollyWoodMovieInterface {
    @Override
    public String getMovieName() {
        return "True Lies is a Hollywood Action Movie";
    }
}
