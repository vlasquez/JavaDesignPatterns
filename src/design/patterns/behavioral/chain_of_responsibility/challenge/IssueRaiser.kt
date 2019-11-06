package design.patterns.behavioral.chain_of_responsibility.challenge

class IssueRaiser(var firstReceiver: ReceiverInterface) {

    fun raiseMessage(message: Message) {
        firstReceiver.processMessage(message)
    }
}