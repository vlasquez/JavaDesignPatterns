package design.patterns.structural.bridge.challenge;

public interface IColor {

    void fillwithColor(int border);
}

class Red implements IColor {

    @Override
    public void fillwithColor(int border) {
        System.out.println("Red Color with " + border + " inch border");
    }
}


class Green implements IColor {

    @Override
    public void fillwithColor(int border) {
        System.out.println("Green Color with " + border + " inch border");
    }
}
