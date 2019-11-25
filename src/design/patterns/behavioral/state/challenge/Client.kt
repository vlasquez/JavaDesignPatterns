package design.patterns.behavioral.state.challenge

fun main() {
    val device = Device()
    device.alert()
    device.alert()

    device.state = SilentState()
    device.alert()
    device.alert()
    device.alert()
}