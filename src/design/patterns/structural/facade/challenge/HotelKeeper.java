package design.patterns.structural.facade.challenge;

public class HotelKeeper {
    public VegMenu getVegMenu() {
        VegRestaurant vegRestaurant = new VegRestaurant();
        return (VegMenu) vegRestaurant.getMenus();
    }

    public Both getBothMenu() {
        VegNonBothRestaurant vegNonBothRestaurant = new VegNonBothRestaurant();
        return (Both) vegNonBothRestaurant.getMenus();
    }

    public NonVegMenu getNonVegMenu() {
        NonVegRestaurant vegRestaurant = new NonVegRestaurant();
        return (NonVegMenu) vegRestaurant.getMenus();
    }
}
