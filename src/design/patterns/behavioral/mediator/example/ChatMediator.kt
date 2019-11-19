package design.patterns.behavioral.mediator.example

interface ChatMediator {
    fun sendMessage(msg: String, user: User)
    fun addUser(user: User)
}

class ChatMediatorImpl : ChatMediator {
    private val userList: MutableList<User> = arrayListOf()

    override fun sendMessage(msg: String, user: User) {
        userList.forEach {
            if (it != user) {
                it.receive(msg)
            }
        }
    }

    override fun addUser(user: User) {
        userList.add(user)
    }
}