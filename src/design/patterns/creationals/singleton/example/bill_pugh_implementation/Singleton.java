package design.patterns.creationals.singleton.example.bill_pugh_implementation;

/**
 * @autor Andrés Velasquez
 * @since 2019-04-20
 **/
public class Singleton {

    //an instance attribute
    private int num1 = 0;
    private int num2 = 0;


    private Singleton() {

    }

    private static class SingletonHelper {
        //Nested class is referenced after getInstance is called
        private static final Singleton instance = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHelper.instance;
    }

    //add a set data
    public int sumNumbers() {
        return num1 + num2;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
}

