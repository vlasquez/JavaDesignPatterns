package design.patterns.structural.proxy.example;

public class Client {

    public static void main(String[] args) {
        Image image = new ProxyImage("someFilename.png");

        image.display();
        System.out.println("");

        image.display();
    }

}
