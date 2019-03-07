package design.principles.programmingToAnInterface;

public class Main {

    public static void main (String[] args){
        Computer computer = new Computer();
        IDisplayModule  dm = new Monitor();
        IDisplayModule  dm1 = new Projector();

        computer.setDisplayModule(dm);
        computer.display();

        computer.setDisplayModule(dm1);
        computer.display();
    }
}
