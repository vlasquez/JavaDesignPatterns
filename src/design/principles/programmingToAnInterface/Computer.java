package design.principles.programmingToAnInterface;

public class Computer {

    IDisplayModule displayModule;

    public void setDisplayModule(IDisplayModule displayModule) {
        this.displayModule = displayModule;
    }

    public void display(){
        displayModule.display();
    }


}
