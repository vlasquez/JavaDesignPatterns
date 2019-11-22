package design.patterns.behavioral.observable.example

fun main() {

    val topic = MyTopic()

    val obj1 = MyTopicSubscriber("Obj1")
    val obj2 = MyTopicSubscriber("Obj2")
    val obj3 = MyTopicSubscriber("Obj3")
    val obj4 = MyTopicSubscriber("Obj4")

    topic.register(obj1)
    topic.register(obj2)
    topic.register(obj3)
    topic.register(obj4)

    obj1.setSubject(topic)
    obj2.setSubject(topic)
    obj3.setSubject(topic)
    obj4.setSubject(topic)

    obj1.update()
    obj2.update()

    topic.postMessage("New message")
}