package design.patterns.behavioral.state.example

fun main() {
    val initialState = Off()
    val tv = TV(initialState)
    tv.pressButton()
    tv.pressButton()
}