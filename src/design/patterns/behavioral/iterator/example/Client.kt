package design.patterns.behavioral.iterator.example

fun main(args: Array<String>) {
        val notificationCollection = NotificationCollection()
        val notificationBarBar = NotificationBar(notificationCollection)
        notificationBarBar.printNotifications()}

