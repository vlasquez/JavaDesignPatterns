package design.patterns.creationals.abstract_factory.challenge.comedy;

import design.patterns.creationals.abstract_factory.challenge.HollyWoodMovieInterface;

/**
 * @autor Andrés Velasquez
 * @since 2019-04-14
 **/
public class HollyWoodComedyMovie implements HollyWoodMovieInterface {

    @Override
    public String getMovieName() {
        return "The Jerk is a Hollywood Comedy Movie";
    }
}
