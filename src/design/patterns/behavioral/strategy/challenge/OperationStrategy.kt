package design.patterns.behavioral.strategy.challenge

interface OperationStrategy {
    fun execute(num1: Int, num2: Int): Int
}

class Add : OperationStrategy {
    override fun execute(num1: Int, num2: Int): Int = num1 + num2
}

class Substract : OperationStrategy {
    override fun execute(num1: Int, num2: Int): Int = num1 - num2
}

class Multiply : OperationStrategy {
    override fun execute(num1: Int, num2: Int): Int = num1 * num2
}
