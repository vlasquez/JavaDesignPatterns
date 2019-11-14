package design.patterns.behavioral.command.example;

public class Client {
    public static void main(String[] args) {
        //creating the receiver
        FileSystemReceiver fs = FileSystemReceiverUtil.Companion.getUnderlyingFileSystem();

        //Creating the command with associating receiver
        OpenFileCommand openFileCommand = new OpenFileCommand(fs);

        //creating invoker and associate it with the command
        FileInvoker file = new FileInvoker(openFileCommand);
        // Performing action on invoker object
        file.execute();
    }
}

