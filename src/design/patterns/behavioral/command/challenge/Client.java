package design.patterns.behavioral.command.challenge;

public class Client {
    public static void main(String[] args) {
        Stock googleStock = new Stock();

        BuyStock buyStock = new BuyStock(googleStock);
        SellStock sellStock = new SellStock(googleStock);

        Broker broker = new Broker();
        broker.takeOrder(buyStock);
        broker.takeOrder(sellStock);

        broker.placeOrders();

    }
}

