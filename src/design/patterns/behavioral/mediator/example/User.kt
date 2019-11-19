package design.patterns.behavioral.mediator.example

abstract class User(
    protected val mediator: ChatMediator
    , protected var name: String
) {

    abstract fun send(msg: String)
    abstract fun receive(msg: String)
}

class UserImpl(mediator: ChatMediator, name: String) : User(mediator, name) {
    override fun send(msg: String) {
        println("$name : Sending message -> $msg")
        mediator.sendMessage(msg, this)
    }

    override fun receive(msg: String) {
        println("$name : Received message -> $msg")
    }
}