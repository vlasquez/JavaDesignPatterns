package design.patterns.behavioral.visitor.challenge

interface ItemElement {
    fun accept(visitor: Visitor)
}

class Book(val price: Int, val weight: Int) : ItemElement {
    override fun accept(visitor: Visitor){
        return visitor.visit(this)
    }
}

class CD(val price: Int, val weight: Int) : ItemElement {
    override fun accept(visitor: Visitor) {
        return visitor.visit(this)
    }
}

class DVD(val price: Int, val weight: Int) : ItemElement {
    override fun accept(visitor: Visitor) {
        return visitor.visit(this)
    }
}