package design.patterns.structural.decorator.example1;

abstract class AbstractDecorator extends Component {

    private Component component;

    public void setComponent(Component component) {
        this.component = component;
    }

    @Override
    public void doJob() {
        if (component != null) {
            component.doJob();
        }
    }
}

class ConcreteDecorator extends AbstractDecorator {

    @Override
    public void doJob() {
        super.doJob();

        // here we gonna add additional responsibilities

        System.out.println("I am explicity from Ex_1");
    }
}


class ConcreteDecorator2 extends AbstractDecorator {

    @Override
    public void doJob() {
        System.out.println("");
        System.out.println("*** Start concrete decorator 2 ***");
        super.doJob();
        // here we gonna add additional responsibilities
        System.out.println("I am explicity from Ex_2");
        System.out.println("*** End concrete decorator 2 ***");
    }
}
