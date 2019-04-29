package design.patterns.structural.adapter.object_composition.example_1;


/**
 * @autor Andrés Velasquez
 * @since 2019-04-28
 **/


import design.patterns.structural.adapter.object_composition.example_1.duck.Duck;
import design.patterns.structural.adapter.object_composition.example_1.turkey.Turkey;

/**
 * Adapter Pattern using object composition
 **/
public class TurkeyAdapter implements Duck {

    Turkey turkey;


    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        for (int i = 0; i < 5; i++) {
            turkey.fly();
        }
    }
}
