package design.patterns.behavioral.command.challenge

class Stock {
    private val name = "Google"
    private val quantity = 1000

    fun buy() {
        println("Stock [ name: $name quantity: $quantity] bought")
    }

    fun sell() {
        println("Stock [ name: $name quantity: $quantity] sold")
    }
}