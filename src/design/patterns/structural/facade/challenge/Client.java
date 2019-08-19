package design.patterns.structural.facade.challenge;

public class Client {
    public static void main(String[] args) {
        HotelKeeper keeper = new HotelKeeper();

        VegMenu vegMenu = keeper.getVegMenu();
        Both both = keeper.getBothMenu();
        NonVegMenu nonVegMenu = keeper.getNonVegMenu();

        vegMenu.showMenu();
        both.showMenu();
        nonVegMenu.showMenu();
    }
}
