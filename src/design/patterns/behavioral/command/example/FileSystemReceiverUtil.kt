package design.patterns.behavioral.command.example

class FileSystemReceiverUtil {
    companion object {
        fun getUnderlyingFileSystem(): FileSystemReceiver {
            val osName = System.getProperty("os.name")
            println("Underlying OS is:$osName")
            return if (osName.contains("Windows")) {
                WindowsFileSystemReceiver()
            } else {
                UnixFileSystemReceiver()
            }
        }
    }
}