package design.patterns.behavioral.visitor.example

interface ItemElement {
    fun accept(visitor: ShoppingCartVisitor): Int
}

class Book(val price: Int, val isBnNumber: String) : ItemElement {
    override fun accept(visitor: ShoppingCartVisitor): Int {
        return visitor.visit(this)
    }
}

class Fruit(val pricePerPkg: Int, val weight: Int, val name: String) : ItemElement {


    override fun accept(visitor: ShoppingCartVisitor): Int {
        return visitor.visit(this)
    }
}