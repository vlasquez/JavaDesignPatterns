package design.patterns.creationals.singleton.challenge;

/**
 * @autor Andrés Velasquez
 * @since 2019-04-20
 **/
public class CaptainSingleton {

    private CaptainSingleton() {

    }

    private static class CaptainHelper {

        private static final CaptainSingleton instance = new CaptainSingleton();
    }

    public static CaptainSingleton getInstance() {
        return CaptainHelper.instance;
    }

    public String captainName() {
        return "C1";
    }
}
