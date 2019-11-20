package design.patterns.behavioral.memento.example

class FileWriterUtil(var filename: String) {
    private lateinit var content: StringBuilder

    init {
        this.content = java.lang.StringBuilder()
    }

    override fun toString(): String {
        return this.content.toString()
    }

    fun write(str: String) {
        content.append(str)
    }

    fun save(): Any {
        return Memento(this.filename, this.content)
    }

    fun undoToLastSave(obj: Any) {
        val memento = obj as Memento
        this.filename = memento.filename
        this.content = memento.content
    }

    private class Memento(val filename: String, var content: StringBuilder) {
        init {
            this.content = java.lang.StringBuilder(content)
        }
    }
}