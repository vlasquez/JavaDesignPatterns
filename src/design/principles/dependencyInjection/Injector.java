package design.principles.dependencyInjection;

public class Injector {
    public static void main(String[]args){
        Service service = new ServiceA();

        Client client = new Client(service);
        client.doSomething();
        client.setService(service);
    }
}
