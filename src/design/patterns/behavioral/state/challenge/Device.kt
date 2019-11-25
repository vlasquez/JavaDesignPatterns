package design.patterns.behavioral.state.challenge

class Device(var state: PhoneStates = VibrationState()) {
    fun alert() {
        state.showAlert()
    }
}