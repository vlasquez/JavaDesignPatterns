package design.patterns.behavioral.command.example

class FileInvoker(private val command: Command) {
    fun execute() {
        command.execute()
    }
}