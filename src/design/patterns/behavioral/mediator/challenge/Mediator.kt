package design.patterns.behavioral.mediator.challenge

interface Mediator {
    fun addBuyer(buyer: Buyer)
    fun findHigestBigger()
}

class AuctionMediator : Mediator {
    private val buyerList: MutableList<Buyer> = arrayListOf()

    override fun addBuyer(buyer: Buyer) {
        buyerList.add(buyer)
        println("${buyer.name} was added to the buyers list.")
    }

    override fun findHigestBigger() {
        var maxBid: Int = 0
        var winner: Buyer? = null

        buyerList.forEach {
            if (it.price!! > maxBid) {
                maxBid = it.price!!
                winner = it
            }
            it.auctionHasEnded()
        }
        println("The auction winner is ${winner!!.name}. He paid ${winner!!.price} for the item")
    }
}