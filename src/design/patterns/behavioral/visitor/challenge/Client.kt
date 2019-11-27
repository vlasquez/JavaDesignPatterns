package design.patterns.behavioral.visitor.challenge

fun main() {
    val items = mutableListOf<ItemElement>(
        Book(18, 3),
        Book(14, 3),
        Book(16, 3),
        Book(11, 3),
        DVD(6, 2),
        DVD(8, 2),
        DVD(8, 2),
        CD(3, 4),
        CD(2, 1),
        CD(3, 4),
        CD(3, 5)
    )

    var total = calculatePrice(items, USPostageImpl())
    println("Total cost to Us: $total")
    total = calculatePrice(items, SouthAmericaPostageVisitorImpl())
    println("Total cost to SouthAmerica: $total")
}

fun calculatePrice(items: MutableList<ItemElement>, visitor: Visitor): Double {

    items.forEach {
        it.accept(visitor)
    }
    return visitor.postage
}
