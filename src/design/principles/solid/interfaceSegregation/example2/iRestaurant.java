package design.principles.solid.interfaceSegregation.example2;

public interface iRestaurant {
    /** Para implementar correctamente el principio de sustitucion de Liskov se deben crear:
     *
     * Una interface llamada iOrder con los metodos:
     * acceptOnlineOrder()
     * takeTelephoneOrder()
     * walkInCostumerOrder()
     *
     * Otra interface llamada iPayment con los metodos:
     * payOnline()
     * payInPerson()
     */
    void acceptOnlineOrder();
    void takeTelephoneOrder();
    void payOnline();
    void walkInCustomerOrder();
    void payInPerson();

}
