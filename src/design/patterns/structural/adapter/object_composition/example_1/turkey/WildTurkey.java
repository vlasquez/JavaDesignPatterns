package design.patterns.structural.adapter.class_inheritance.turkey;

import design.patterns.structural.adapter.class_inheritance.turkey.Turkey;

/**
 * @autor Andrés Velasquez
 * @since 2019-04-28
 **/
public class WildTurkey implements Turkey {

    @Override
    public void gobble() {
        System.out.println("Gobble gobble");
    }

    @Override
    public void fly() {
        System.out.println("I am flying a short distance");
    }
}
