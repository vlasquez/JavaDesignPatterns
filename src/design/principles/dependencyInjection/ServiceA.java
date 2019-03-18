package design.principles.dependencyInjection;

public class ServiceA implements Service {


    @Override
    public void write(String message) {
        System.out.println(message);
    }
}
