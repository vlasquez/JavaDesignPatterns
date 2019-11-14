package design.patterns.behavioral.interpreter.example

class InterpreterContext {
    fun getBinaryFormat(i: Int): String = Integer.toBinaryString(i)
    fun getHexadecimalFormat(i: Int): String = Integer.toHexString(i)
}