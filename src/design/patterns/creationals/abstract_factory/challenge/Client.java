package design.patterns.creationals.abstract_factory.challenge;

/**
 * @autor Andrés Velasquez
 * @since 2019-04-14
 **/
public class Client {


    public static void main(String[] args) {
        MovieFactoryInterface actionMovies = FactoryProducer.getFactory("ACTION");

        HollyWoodMovieInterface hAction = actionMovies.getHollyWoodMovie();

        BollyWoodMovieInterface bAction = actionMovies.getBollyWoodMovie();
        System.out.println(hAction.getMovieName());
        System.out.println(bAction.getMovieName());
    }
}
