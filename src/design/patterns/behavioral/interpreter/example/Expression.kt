package design.patterns.behavioral.interpreter.example

interface Expression {
    fun interpret(interpreterContext: InterpreterContext): String
}

class IntToBinaryExpression(private val int: Int) : Expression {

    override fun interpret(interpreterContext: InterpreterContext): String {
        return interpreterContext.getBinaryFormat(int)
    }
}

class IntToHexadecimalExpression(private val int: Int) : Expression {

    override fun interpret(interpreterContext: InterpreterContext): String {
        return interpreterContext.getHexadecimalFormat(int)
    }
}