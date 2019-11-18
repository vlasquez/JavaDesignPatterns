package design.patterns.behavioral.iterator.example

interface Collection {
    fun createIterator(): Iterator
}

class NotificationCollection : Collection {
    private var numberOfItems = 0
    var notificationList: Array<Notification?> = arrayOf()
    override fun createIterator(): Iterator {
        return NotificationIterator(notificationList)
    }

    init {
        notificationList = arrayOfNulls(MAX_ITEMS)
        addItem("Notification 1")
        addItem("Notification 2")
        addItem("Notification 3")
    }

    private fun addItem(str: String) {
        val notification = Notification(str)
        if (numberOfItems >= MAX_ITEMS) {
            println("Full")
        } else {
            notificationList[numberOfItems] = notification
            numberOfItems += 1
        }
    }

    companion object {
        const val MAX_ITEMS = 6
    }
}