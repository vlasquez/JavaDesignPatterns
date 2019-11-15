package design.patterns.behavioral.interpreter.challenge

interface Expression {
    fun interpret(context: Context): Boolean
}

class TerminalExpression(val data: String) : Expression {
    override fun interpret(context: Context): Boolean {
        return context.getResult(data)
    }
}