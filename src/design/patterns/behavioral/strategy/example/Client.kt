package design.patterns.behavioral.strategy.example

fun main() {
    val cart = ShoppingCart()
    val item = Item("1234", 10)
    val item2 = Item("11325", 40)

    cart.addItem(item)
    cart.addItem(item)
    cart.addItem(item)
    cart.addItem(item2)
    cart.addItem(item2)
    cart.addItem(item2)
    cart.addItem(item2)

    cart.pay(PaypalStrategy("andres@velasquez.com", "12344444444444"))
    cart.pay(CreditCardStrategy("Andres", "12344444444444", "123", "12/12/2077"))
}