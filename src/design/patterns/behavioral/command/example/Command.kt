package design.patterns.behavioral.command.example

interface Command {
    fun execute()
    //We could add undo or redo command method
}

class OpenFileCommand(private val fileSystemReceiver: FileSystemReceiver) : Command {

    override fun execute() {
        fileSystemReceiver.openFile()
    }

    fun undo() {
        //restore previous state
    }
}

class CloseFileCommand(private val fileSystemReceiver: FileSystemReceiver) : Command {

    override fun execute() {
        fileSystemReceiver.closeFile()
    }

    fun undo() {
        //restore previous state
    }
}
class WriteFileCommand(private val fileSystemReceiver: FileSystemReceiver) : Command {

    override fun execute() {
        fileSystemReceiver.writeFile()
    }

    fun undo() {
        //restore previous state
    }
}