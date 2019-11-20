package design.patterns.behavioral.memento.example

fun main(args: Array<String>) {
    val careTaker = FileWriterCareTaker()
    val fileWriterUtil = FileWriterUtil("data.txt")
    fileWriterUtil.write("First set of data:\nMyra \nLucy\n")

    println("$fileWriterUtil\n\n")
    careTaker.save(fileWriterUtil)

    fileWriterUtil.write("Second set of data:\nJason\n")
    println("$fileWriterUtil\n\n")

    careTaker.undo(fileWriterUtil)

    println("$fileWriterUtil\n\n")
}
