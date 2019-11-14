package design.patterns.behavioral.command.challenge

class Broker {
    var orderList: MutableList<Order> = arrayListOf()

    fun takeOrder(order: Order) {
        orderList.add(order)
    }

    fun placeOrders() {
        orderList.forEach {
            it.execute()
        }
        orderList.clear()
    }
}