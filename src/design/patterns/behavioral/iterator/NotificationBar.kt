package design.patterns.behavioral.iterator

class NotificationBar(val notificationCollection: NotificationCollection) {

    fun printNotifications() {
        val iterator = notificationCollection.createIterator()
        println("----- NOTIFICATION BAR -------")
        while (iterator.hasNext()) {
            val notification = iterator.next() as Notification
            println(notification.notification)
        }
    }
}