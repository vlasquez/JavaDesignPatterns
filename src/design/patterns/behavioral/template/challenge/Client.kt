package design.patterns.behavioral.template.challenge

fun main() {
    var orderType: OrderProcessTemplate = NetOrder()
    orderType.processOrder(false)
    println("***************")

    orderType = StoreOrder()
    orderType.processOrder(false)
}