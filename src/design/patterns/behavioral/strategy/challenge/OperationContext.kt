package design.patterns.behavioral.strategy.challenge

class OperationContext(private val operationStrategy: OperationStrategy) {
    fun executeStrategy(num1: Int, num2: Int): Int {
        return operationStrategy.execute(num1, num2)
    }
}