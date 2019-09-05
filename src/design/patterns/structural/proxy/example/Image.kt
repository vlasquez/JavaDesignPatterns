package design.patterns.structural.proxy.example

interface Image {
    fun display()
}

class RealImage(val fileName: String) : Image {

    init {
        loadFromDisk(this.fileName)
    }

    private fun loadFromDisk(fileName: String) {
        println("Loading $fileName")
    }

    override fun display() {
        println("Displaying $fileName")
    }
}