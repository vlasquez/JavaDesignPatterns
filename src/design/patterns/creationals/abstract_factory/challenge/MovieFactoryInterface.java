package design.patterns.creationals.abstract_factory.challenge;

/**
 * @autor Andrés Velasquez
 * @since 2019-04-14
 **/
public interface MovieFactoryInterface {

    HollyWoodMovieInterface getHollyWoodMovie();
    BollyWoodMovieInterface getBollyWoodMovie();


}
