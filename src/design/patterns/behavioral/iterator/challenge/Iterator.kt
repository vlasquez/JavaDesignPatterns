package design.patterns.behavioral.iterator.challenge

import java.util.*

interface Iterator {
    fun first()
    fun next(): String
    fun isDone(): Boolean
    fun currentItem(): String
}

class ArtsIterator(private var subjectsList: ArrayList<String?>) : Iterator {
    private var position = 0
    override fun first() {
        position = 0
    }

    override fun next(): String {
        return subjectsList[position++]!!
    }

    override fun isDone(): Boolean {
        return position >= subjectsList.size
    }

    override fun currentItem(): String {
        return subjectsList[position]!!
    }
}

class ScienceIterator(var subjectsList: LinkedList<String>) : Iterator {
    private var position = 0
    override fun first() {
        position = 0
    }

    override fun next(): String {
        return subjectsList[position++]
    }

    override fun isDone(): Boolean {
        return position >= subjectsList.size
    }

    override fun currentItem(): String {
        return subjectsList[position]
    }
}