package design.patterns.behavioral.strategy.challenge

fun main() {
    val num1 = 3
    val num2 = 10
    var context = OperationContext(Add())

    println("$num1 + $num2= ${context.executeStrategy(num1, num2)}")
    context = OperationContext(Substract())
    println("$num1 - $num2= ${context.executeStrategy(num1, num2)}")
    context = OperationContext(Multiply())
    println("$num1 * $num2= ${context.executeStrategy(num1, num2)}")

}