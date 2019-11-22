package design.patterns.behavioral.observable.example

interface Observer {
    fun update()
    fun setSubject(subject: Subject)

}

class MyTopicSubscriber(val name: String) : Observer {
    lateinit var topic: Subject

    override fun update() {
        val msg = topic.getUpdate(this) as String?
        if (msg.isNullOrEmpty()) {
            println("$name :: No new message")
        } else {
            println("$name :: Consuming message:: $msg")
        }
    }

    override fun setSubject(subject: Subject) {
        this.topic = subject
    }
}