package design.patterns.behavioral.memento.example

class FileWriterCareTaker() {
    lateinit var obj: Any
    fun save(fileWriterUtil: FileWriterUtil) {
        this.obj = fileWriterUtil.save()
    }

    fun undo(fileWriterUtil: FileWriterUtil) {
        fileWriterUtil.undoToLastSave(obj)
    }
}