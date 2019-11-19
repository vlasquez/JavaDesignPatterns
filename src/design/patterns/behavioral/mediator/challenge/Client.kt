package design.patterns.behavioral.mediator.challenge

fun main(args: Array<String>) {

    val mediator = AuctionMediator()
    val b1 = AuctionBuyer( "Jason")
    val b2 = AuctionBuyer( "Ian")
    val b3 = AuctionBuyer( "Myra")

    mediator.addBuyer(b1)
    mediator.addBuyer(b2)
    mediator.addBuyer(b3)


    println("Welcome to the auction. Tonight we are selling a vacation program")
    println("-----------------------------------------------------------------")
    println("Waiting for the buyer offers...")

    b1.bid(1800)
    b2.bid(2000)
    b3.bid(780)

    println("-----------------------------------------------------------------")
    mediator.findHigestBigger()
    b2.cancelTheBid()
    println("${b2.name} has canceled the bid")
    mediator.findHigestBigger()

}