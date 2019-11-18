package design.patterns.behavioral.iterator.challenge


fun main(args: Array<String>) {
    val artSubject: ISubject = Art()
    val scienceSubject: ISubject = Science()


    val scienceIterator: Iterator = scienceSubject.createIterator()
    val artIterator: Iterator = artSubject.createIterator()

    println("Science")
    print(scienceIterator)


    println("Art")
    print(artIterator)
}

fun print(iterator: Iterator) {
    while (!iterator.isDone()) {
        println(iterator.next())
    }
}