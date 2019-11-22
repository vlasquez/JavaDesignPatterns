package design.patterns.behavioral.observable.example

interface Subject {
    fun register(observer: Observer)
    fun unregister(observer: Observer)

    fun notifyObservers()

    fun getUpdate(observer: Observer): Any?
}