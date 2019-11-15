package design.patterns.behavioral.interpreter.challenge

class OrExpression(val expr1: Expression, val expr2: Expression) : Expression {

    override fun interpret(context: Context): Boolean {
        return expr1.interpret(context) || expr2.interpret(context)
    }
}