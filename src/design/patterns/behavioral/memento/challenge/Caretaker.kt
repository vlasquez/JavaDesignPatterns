package design.patterns.behavioral.memento.challenge

class Caretaker {
    private val mementoList: MutableList<Memento> = arrayListOf()
    fun add(state: Memento) {
        mementoList.add(state)
    }
    fun get(index: Int): Memento = mementoList[index]
}