package design.patterns.behavioral.iterator.challenge

import java.util.*
import kotlin.collections.ArrayList

interface ISubject {
    fun createIterator(): Iterator
}

class Art : ISubject {
    var subjects: ArrayList<String?> = ArrayList()
    override fun createIterator(): Iterator {
        return ArtsIterator(subjects)
    }

    init {
        subjects.add("Bengali")
        subjects.add("English")
    }
}

class Science : ISubject {
    private val subjects = LinkedList<String>()

    override fun createIterator(): Iterator {
        return ScienceIterator(subjects)
    }

    init {
        subjects.addLast("Math")
        subjects.addLast("Comp. Sc.")
        subjects.addLast("Physics")
    }
}

