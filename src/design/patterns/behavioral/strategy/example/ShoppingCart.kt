package design.patterns.behavioral.strategy.example

class ShoppingCart {
    private val items = mutableListOf<Item>()

    fun addItem(item: Item) {
        items.add(item)
    }

    fun removeItem(item: Item) {
        items.remove(item)
    }

    private fun calculateTotal(): Int {
        var total = 0
        items.forEach {
            total += it.cost
        }
        return total
    }

    fun pay(paymentMethod: PaymentStrategy) {
        val amount = calculateTotal()
        paymentMethod.pay(amount)
    }
}