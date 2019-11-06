package design.patterns.behavioral.chain_of_responsibility.challenge

interface ReceiverInterface {
    fun processMessage(message: Message): Boolean
    fun setNextChain(receiverInterface: ReceiverInterface)
}

class FaxErrorHandler : ReceiverInterface {
    var nextReceiver: ReceiverInterface? = null

    override fun processMessage(message: Message): Boolean {
        if (message.text.contains("Fax")) {
            println("FaxErrorHandler processed ${message.priority}  priority issue ${message.text}")
            return true
        } else {
            if (nextReceiver != null) {
                nextReceiver!!.processMessage(message)
            }
        }
        return false
    }

    override fun setNextChain(receiverInterface: ReceiverInterface) {
        this.nextReceiver = receiverInterface
    }
}

class EmailErrorHandler : ReceiverInterface {
    var nextReceiver: ReceiverInterface? = null

    override fun processMessage(message: Message): Boolean {
        if (message.text.contains("Email")) {
            println("EmailErrorHandler processed ${message.priority}  priority issue ${message.text}")
            return true
        } else {
            if (nextReceiver != null) {
                nextReceiver!!.processMessage(message)
            }
        }
        return false
    }

    override fun setNextChain(receiverInterface: ReceiverInterface) {
        this.nextReceiver = receiverInterface
    }
}