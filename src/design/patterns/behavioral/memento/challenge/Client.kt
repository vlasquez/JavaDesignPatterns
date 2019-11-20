package design.patterns.behavioral.memento.challenge

fun main(args: Array<String>) {
    val originator = Originator()
    val caretaker = Caretaker()

    originator.state = "State #1"
    originator.state = "State #2"
    caretaker.add(originator.saveStateToMemento())

    originator.state = "State #3"
    caretaker.add(originator.saveStateToMemento())

    originator.state = "State #4"
    println("Current state: ${originator.state}")

    originator.getStateFromMemento(caretaker.get(0))
    println("First saved state ${originator.state}")

    originator.getStateFromMemento(caretaker.get(1))
    println("First saved state ${originator.state}")

}