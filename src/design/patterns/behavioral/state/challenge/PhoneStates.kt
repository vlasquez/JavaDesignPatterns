package design.patterns.behavioral.state.challenge

interface PhoneStates {
    fun showAlert()
}

class VibrationState : PhoneStates {
    override fun showAlert() {
        println("Vibration Enabled")
    }
}

class SilentState : PhoneStates {
    override fun showAlert() {
        println("Silent mode Enabled")
    }
}