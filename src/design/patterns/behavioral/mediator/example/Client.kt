package design.patterns.behavioral.mediator.example

fun main(args: Array<String>) {
    val mediator: ChatMediator = ChatMediatorImpl()
    val user1 = UserImpl(mediator, "Jason")
    val user2 = UserImpl(mediator, "Jennifer")
    val user3 = UserImpl(mediator, "Lucy")
    val user4 = UserImpl(mediator, "Ian")

    mediator.addUser(user1)
    mediator.addUser(user2)
    mediator.addUser(user3)
    mediator.addUser(user4)

    user1.send("hi All from Colombia")
    user2.send("hi All from Peru")
    user3.send("hi All from USA")
}