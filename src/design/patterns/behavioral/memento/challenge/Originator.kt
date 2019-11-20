package design.patterns.behavioral.memento.challenge

class Originator() {
    var state: String? = null
    fun saveStateToMemento(): Memento = Memento(state!!)
    fun getStateFromMemento(memento: Memento) {
        state = memento.state
    }
}