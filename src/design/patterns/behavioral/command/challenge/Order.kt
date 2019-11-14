package design.patterns.behavioral.command.challenge

interface Order {
    fun execute()
}

class BuyStock(private val stock: Stock) : Order {
    override fun execute() {
        stock.buy()
    }
}

class SellStock(private val stock: Stock) : Order {
    override fun execute() {
        stock.sell()
    }
}
