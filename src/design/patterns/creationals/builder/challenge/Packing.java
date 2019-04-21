package design.patterns.creationals.builder.challenge;

/**
 * @autor Andrés Velasquez
 * @since 2019-04-20
 **/
public interface Packing {

    String pack();
}

class Wrapper implements Packing {

    @Override
    public String pack() {
        return "Wrapper";
    }
}

class Bottle implements Packing {
    @Override
    public String pack() {
        return "Bottle";
    }
}
