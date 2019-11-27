package design.patterns.behavioral.template.challenge

abstract class OrderProcessTemplate {

    fun giftWrap() {
        println("gift wrap successfull")
    }

    fun processOrder(isGift: Boolean) {
        doSelect()
        doPayment()

        when {
            isGift -> giftWrap()
        }

        doDelivery()
    }

    abstract fun doSelect()
    abstract fun doPayment()
    abstract fun doDelivery()
}

class NetOrder : OrderProcessTemplate() {
    override fun doSelect() {
        println("Item added to online shopping cart")
        println("Get gift wrap preference")
        println("Get delivery address")
    }

    override fun doPayment() {
        println("Online payment through Netbanking, card or Paypal")
    }

    override fun doDelivery() {
        println("Ship the item through post office to delivery address")
    }
}

class StoreOrder() : OrderProcessTemplate() {
    override fun doSelect() {
        println("Customer chooses the item from shelf")
    }

    override fun doPayment() {
        println("Pays at counter through cash/POS")
    }

    override fun doDelivery() {
        println("Item delivered to in delivery counter")
    }
}