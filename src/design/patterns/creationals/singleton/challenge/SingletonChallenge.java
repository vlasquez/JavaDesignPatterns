package design.patterns.creationals.singleton.challenge;

/**
 * @autor Andrés Velasquez
 * @since 2019-04-20
 **/
public class SingletonChallenge {

    public static void main(String[] args) {

        CaptainSingleton captainSingleton = CaptainSingleton.getInstance();

        captainSingleton.captainName();

        CaptainSingleton captainSingleton2 = CaptainSingleton.getInstance();

        captainSingleton.captainName();

        if (captainSingleton.equals(captainSingleton2)) {
            System.out.println("Son los mismos capitanes");
        }
    }
}
