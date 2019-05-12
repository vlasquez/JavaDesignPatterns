package design.patterns.structural.adapter.class_implementation;

public class Client {

    public static void main(String[] args) {
        System.out.println("*** Class and Object adapter Demo***");

        ClassAdapter ca = new ClassAdapter();
        System.out.println("Class Adapter is returning: " + ca.getInteger());

        ObjectAdapter oa = new ObjectAdapter(new IntegerValue());
        System.out.println("Object Adapter is returning: " + oa.getInteger());
    }
}
