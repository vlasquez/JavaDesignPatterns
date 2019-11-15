package design.patterns.creationals.singleton.example.lazy_evaluation;

/**
 * @autor Andrés Velasquez
 * @since 2019-04-20
 **/
public class Singleton {
    // the private reference to the one and only instance
    private static Singleton instance = null;

    //an instance attribute

    private int num1 = 0;
    private int num2 = 0;


    private Singleton() {

    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
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

