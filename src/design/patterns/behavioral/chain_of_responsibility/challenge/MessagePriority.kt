package design.patterns.behavioral.chain_of_responsibility.challenge

enum class MessagePriority {
    NORMAL, HIGH
}

class Message(val text: String, val priority: MessagePriority)