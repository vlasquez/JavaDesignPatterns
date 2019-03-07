package design.principles.programmingToAnInterface;

public class Monitor implements IDisplayModule {

    @Override
    public void display() {
        System.out.println("Display through Monitor");
    }
}
