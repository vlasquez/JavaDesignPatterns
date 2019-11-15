package design.patterns.behavioral.interpreter.challenge

class Context(val input: String) {
    fun getResult(data: String): Boolean {
        return input.contains(data)
    }
}