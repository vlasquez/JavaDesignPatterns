package design.patterns.structural.proxy.challenge

class ProxyInternet() : Internet {
    private val internet = RealInternet()

    override fun connectTo(serverHost: String) {
        if (bannedSites.contains(serverHost.toLowerCase())) {
            throw Exception("Access denied")
        }
        internet.connectTo(serverHost)
    }

    companion object {
        val bannedSites = mutableListOf("whatever.com", "nope.com", "yup.com", "petardas.com")
    }

}