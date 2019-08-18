package design.patterns.structural.decorator.example1;

abstract class Component {
public abstract void doJob();

}

class ConcreteComponent extends Component{
    @Override
    public void doJob() {
        System.out.println("I am a Concrete Component - Im Closed for modification");
    }
}

