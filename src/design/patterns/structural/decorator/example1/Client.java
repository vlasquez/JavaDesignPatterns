package design.patterns.structural.decorator.example1;

public class Client {

    public static void main(String[] args) {
        System.out.println("***Decorator pattern demo***");
        ConcreteComponent concreteComponent = new ConcreteComponent();

        ConcreteDecorator cd1 = new ConcreteDecorator();
        cd1.setComponent(concreteComponent);
        cd1.doJob();

        ConcreteDecorator2 cd2 = new ConcreteDecorator2();
        cd2.setComponent(cd1);

        cd2.doJob();

    }
}
