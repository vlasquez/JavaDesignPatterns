package design.patterns.behavioral.visitor.example

fun main() {
    val items = mutableListOf<ItemElement>(
        Book(20, "1234"),
        Fruit(10, 2, "Banana"),
        Book(45, "2435553354340"),
        Fruit(12, 22, "Apple")
    )

    val total = calculatePrice(items)
    println("Total cost: $total")
}

fun calculatePrice(items: MutableList<ItemElement>): Int {
    val visitor = ShoppingCartVisitorImpl()

    var total = 0

    items.forEach {
        total += it.accept(visitor)
    }
    return total
}
