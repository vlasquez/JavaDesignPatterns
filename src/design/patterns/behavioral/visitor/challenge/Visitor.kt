package design.patterns.behavioral.visitor.challenge

interface Visitor {
    var postage: Double
    fun visit(book: Book)
    fun visit(cd: CD)
    fun visit(dvd: DVD)
}

class USPostageImpl : Visitor {
    private var value = 0.0
    override var postage: Double
        get() = value
        set(value) {}

    override fun visit(book: Book) {
        if (book.price < 20) {
            value += book.weight * 2
        }
    }

    override fun visit(cd: CD) {
        if (cd.price < 20) {
            value += cd.weight * 2.5
        }
    }

    override fun visit(dvd: DVD) {
        if (dvd.price < 20) {
            value += dvd.weight * 3
        }
    }
}

class SouthAmericaPostageVisitorImpl : Visitor {
    private var value = 0.0
    override var postage: Double
        get() = value
        set(value) {}

    override fun visit(book: Book) {
        if (book.price < 30) {
            value += (book.weight * 2) * 2
        }
    }

    override fun visit(cd: CD) {
        if (cd.price < 30) {
            value += (cd.weight * 2.5) * 2
        }
    }

    override fun visit(dvd: DVD) {
        if (dvd.price < 30) {
            value += (dvd.weight * 3) * 2
        }
    }
}