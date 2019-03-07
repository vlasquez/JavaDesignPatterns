package design.principles.programmingToAnInterface;

class Projector implements IDisplayModule {
    @Override
    public void display() {
        System.out.println("Display through Projector");
    }
}
