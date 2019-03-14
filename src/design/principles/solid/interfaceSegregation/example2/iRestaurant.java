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
    public void acceptOnlineOrder();
    public void takeTelephoneOrder();
    public void payOnline();
    public void walkInCustomerOrder();
    public void payInPerson();

}
