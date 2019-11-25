package design.patterns.behavioral.state.example

class TV(var state: RemoteControl) {
    fun pressButton() {
        state.pressSwitch(this)
    }
}