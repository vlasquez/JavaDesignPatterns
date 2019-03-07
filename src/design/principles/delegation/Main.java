package design.principles.delegation;

public class Tester {

    /**
     * To the outside world it looks like Printer actually prints
     */

    public static void main (String[] args){
        Printer printer = new Printer();
        printer.print();
    }
}
