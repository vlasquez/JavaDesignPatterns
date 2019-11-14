package design.patterns.behavioral.command.example

interface FileSystemReceiver {
    fun openFile()
    fun writeFile()
    fun closeFile()
}

class UnixFileSystemReceiver : FileSystemReceiver {
    override fun openFile() {
        println("Opening file in UNIX OS")
    }

    override fun writeFile() {
        println("Writing file in UNIX OS")
    }

    override fun closeFile() {
        println("Closing file in UNIX OS")
    }
}

class WindowsFileSystemReceiver : FileSystemReceiver {
    override fun openFile() {
        println("Opening file in Windows OS")
    }

    override fun writeFile() {
        println("Writing file in Windows OS")
    }

    override fun closeFile() {
        println("Closing file in Windows OS")
    }
}