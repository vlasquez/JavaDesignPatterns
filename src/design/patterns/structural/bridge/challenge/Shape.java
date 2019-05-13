package design.patterns.structural.bridge.challenge;

abstract class Shape {
    protected IColor color;

    protected Shape(IColor c) {
        this.color = c;
    }

    abstract void drawShape(int border);

    abstract void modifyBorder(int border, int increment);
}

class Triangle extends Shape {

    public Triangle(IColor c) {
        super(c);
    }

    @Override
    void drawShape(int border) {
        System.out.println("This Triangle is colored with");
        color.fillwithColor(border);
    }

    @Override
    void modifyBorder(int border, int increment) {
        System.out.println("\nNow we are changing the border length " + increment + " times");
        border = border * increment;
        drawShape(border);
    }
}

class Rectangle extends Shape {

    public Rectangle(IColor c) {
        super(c);
    }

    @Override
    void drawShape(int border) {
        System.out.println("This Rectangle is colored with");
        color.fillwithColor(border);
    }

    @Override
    void modifyBorder(int border, int increment) {
        System.out.println("\nNow we are changing the border length " + increment + " times");
        border = border * increment;
        drawShape(border);
    }
}