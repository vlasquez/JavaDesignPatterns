package design.patterns.behavioral.state.example

abstract class RemoteControl() {
    abstract fun pressSwitch(context: TV)

}

class On : RemoteControl() {
    override fun pressSwitch(context: TV) {
        println("Im already On. Going to be Off now")
        context.state = Off()
    }
}

class Off : RemoteControl() {
    override fun pressSwitch(context: TV) {
        println("Im already Off. Going to be On now")
        context.state = On()
    }
}