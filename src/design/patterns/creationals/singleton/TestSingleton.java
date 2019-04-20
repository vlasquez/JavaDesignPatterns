package design.patterns.creationals.singleton;

import design.patterns.creationals.singleton.example.double_checked_locking.lazy_evaluation.Singleton;

/**
 * @autor Andrés Velasquez
 * @since 2019-04-20
 **/
public class TestSingleton {

    public static void main(String[] args) {

        Singleton sObject = Singleton.getInstance();

        // set the data value
        sObject.setNum1(55);
        sObject.setNum2(45);

        System.out.println("La suma es: " + sObject.sumNumbers());


    }
}
