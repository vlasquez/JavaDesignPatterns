package design.principles.delegation;


/** The "delegator"***/

public class Printer {

    RealPrinter realPrinter = new RealPrinter();


    /**create the delegate **/
    void print(){
        realPrinter.print();
    }

}
