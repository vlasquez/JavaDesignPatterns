package design.patterns.behavioral.observable.example

class MyTopic() : Subject {
    private val observers: MutableList<Observer> = mutableListOf()
    var message: String? = null
    private var changed: Boolean? = null

    override fun register(observer: Observer) {
        if (!observers.contains(observer)) {
            observers.add(observer)
        }
    }

    override fun unregister(observer: Observer) {
        observers.remove(observer)
    }

    override fun notifyObservers() {
        var observersLocal = mutableListOf<Observer>()
        if (!changed!!) return

        observersLocal = observers
        this.changed = false

        observersLocal.forEach {
            it.update()
        }
    }

    override fun getUpdate(observer: Observer): Any? {
        return this.message
    }

    fun postMessage(message: String) {
        println("Message Posted to topic: $message")
        this.message = message
        this.changed = true
        notifyObservers()
    }
}