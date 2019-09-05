package design.patterns.structural.proxy.challenge

class Client {
    companion object {
        val internet: Internet = ProxyInternet()
        @JvmStatic
        fun main(args: Array<String>) {
            try {
                internet.connectTo("google.com")
                internet.connectTo("petardas.com")
                internet.connectTo("youtube.com")
                internet.connectTo("nope.com")
            } catch (e: Exception) {
                println(e)
            }
        }
    }
}