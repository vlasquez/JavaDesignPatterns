package design.patterns.structural.proxy.challenge

interface Internet {

    @Throws(Exception::class)
    fun connectTo(serverHost: String) {
    }
}

class RealInternet : Internet {

    override fun connectTo(serverHost: String) {
        println("Connecting to $serverHost")
    }
}