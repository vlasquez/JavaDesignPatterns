package design.patterns.structural.adapter.class_inheritance;

import design.patterns.structural.adapter.class_inheritance.duck.Duck;
import design.patterns.structural.adapter.class_inheritance.turkey.Turkey;

/**
 * @autor Andrés Velasquez
 * @since 2019-04-28
 **/


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
