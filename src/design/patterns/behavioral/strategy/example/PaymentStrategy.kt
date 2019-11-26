package design.patterns.behavioral.strategy.example

interface PaymentStrategy {
    fun pay(amount: Int)
}

class CreditCardStrategy(name: String, cardNumber: String, cvv: String, dateOfExpiry: String) : PaymentStrategy {
    override fun pay(amount: Int) {
        println("$amount paid with credit/debit card")
    }
}

class PaypalStrategy(email: String, password: String) : PaymentStrategy {
    override fun pay(amount: Int) {
        println("$amount paid using Paypal")
    }
}
