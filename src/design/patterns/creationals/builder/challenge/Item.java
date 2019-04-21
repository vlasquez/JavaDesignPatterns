package design.patterns.creationals.builder.challenge;

/**
 * @autor Andrés Velasquez
 * @since 2019-04-20
 **/
public interface Item {
    String name();

    Packing packing();

    float price();
}

abstract class Burger implements Item {


    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();

}

class VegBurger extends Burger {
    @Override
    public float price() {
        return 25.9f;
    }

    @Override
    public String name() {
        return "Veg Burger";
    }
}

class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 50.5f;
    }
}

abstract class ColdDrink implements Item {


    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}

class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 35.5f;
    }
}

class Coke extends ColdDrink {
    @Override
    public String name() {
        return "Coca Cola";
    }

    @Override
    public float price() {
        return 24.3f;
    }
}

