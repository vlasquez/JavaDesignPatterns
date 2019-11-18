package design.patterns.behavioral.iterator

interface Iterator {
    fun hasNext(): Boolean
    fun next(): Any
}

class NotificationIterator(private val notificationList: Array<Notification?>) : Iterator {
    var pos = 0

    override fun hasNext(): Boolean {
        return !(pos >= notificationList.size || notificationList[pos] == null)
    }

    override fun next(): Any {
        val notification = notificationList[pos]
        pos += 1
        return notification!!
    }
}