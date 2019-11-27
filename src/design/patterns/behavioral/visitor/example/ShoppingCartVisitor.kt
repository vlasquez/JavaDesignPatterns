package design.patterns.behavioral.visitor.example

interface ShoppingCartVisitor {
    fun visit(book: Book): Int
    fun visit(fruit: Fruit): Int
}

class ShoppingCartVisitorImpl : ShoppingCartVisitor {
    override fun visit(book: Book): Int {
        var price = 0
        price = if (book.price > 50) {
            println("ISBN: ${book.isBnNumber} price: ${book.price - 5}")
            book.price - 5
        } else {
            println("ISBN: ${book.isBnNumber} price: ${book.price}")

            book.price
        }

        return price
    }

    override fun visit(fruit: Fruit): Int {
        val price = fruit.pricePerPkg * fruit.weight
        println("Name: ${fruit.name} Price: $price")
        return price
    }
}