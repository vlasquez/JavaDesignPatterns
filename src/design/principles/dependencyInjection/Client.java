package design.principles.dependencyInjection;

public class Client {

    private Service service;

    /**
     * Dependency Injection via Constructor
     */
    public Client(Service service) {
        this.service = service;
    }


    public void doSomething(){
        service.write("Message");
    }


    /**
     * Dependency Injection via Setter
     */
    public void setService(Service service){
        this.service = service;
    }
}
