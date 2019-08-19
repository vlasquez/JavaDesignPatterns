package design.patterns.structural.facade.challenge;

public interface Hotel {
    Menus getMenus();
}

class NonVegRestaurant implements Hotel {
    public Menus getMenus() {
        return new NonVegMenu();
    }
}

class VegRestaurant implements Hotel {
    public Menus getMenus() {
        return new VegMenu();
    }
}

class VegNonBothRestaurant implements Hotel {
    public Menus getMenus() {
        return new Both();
    }
}



