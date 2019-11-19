package design.patterns.behavioral.mediator.challenge

abstract class Buyer(
    open val name: String
) {
    var price: Int? = null

    abstract fun bid(price: Int)
    abstract fun cancelTheBid()
    abstract fun auctionHasEnded()
}

class AuctionBuyer(override val name: String) : Buyer(name) {
    override fun bid(price: Int) {
        this.price = price
    }

    override fun cancelTheBid() {
        this.price = -1
    }

    override fun auctionHasEnded() {
        println("Received message that the auction is over: $name")
    }

}