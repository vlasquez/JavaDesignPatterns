package design.patterns.behavioral.observable.challenge


interface Subject {
    fun registerObserver(observer: Observer)
    fun unregisterObserver(observer: Observer)
    fun notifyObservers()
}

class CricketData : Subject {
    val runs: Int = 90
    val wickets: Int = 2
    val overs: Float = 10.2F

    val observerList = mutableListOf<Observer>()

    override fun registerObserver(observer: Observer) {
        observerList.add(observer)
    }

    override fun unregisterObserver(observer: Observer) {
        observerList.remove(observer)
    }

    override fun notifyObservers() {
        observerList.forEach {
            it.update(runs, wickets, overs)
        }
    }

    fun dataChanged() {
        notifyObservers()
    }

}