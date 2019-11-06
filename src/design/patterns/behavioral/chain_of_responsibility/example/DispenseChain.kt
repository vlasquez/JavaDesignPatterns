package design.patterns.behavioral.chain_of_responsibility.example

interface DispenseChain {
    fun setNextChain(nextChain: DispenseChain)
    fun dispense(currency: Currency)
}

class Dollar50Dispensor : DispenseChain {
    private lateinit var chain: DispenseChain
    override fun setNextChain(nextChain: DispenseChain) {
        chain = nextChain
    }

    override fun dispense(currency: Currency) {
        if (currency.amount >= 50) {
            val num = currency.amount / 50
            val remainder = currency.amount % 50

            println("Dispensing $num $50 note")

            if (remainder != 0) {
                this.chain.dispense(Currency(remainder))
            }
        } else {
            this.chain.dispense(currency)
        }
    }

}

class Dollar20Dispensor : DispenseChain {
    private lateinit var chain: DispenseChain
    override fun setNextChain(nextChain: DispenseChain) {
        chain = nextChain
    }

    override fun dispense(currency: Currency) {
        if (currency.amount >= 20) {
            val num = currency.amount / 20
            val remainder = currency.amount % 20

            println("Dispensing $num $20 note")

            when {
                remainder != 0 -> this.chain.dispense(Currency(remainder))
            }
        } else {
            this.chain.dispense(currency)
        }
    }
}

class Dollar10Dispensor : DispenseChain {
    private lateinit var chain: DispenseChain
    override fun setNextChain(nextChain: DispenseChain) {
        chain = nextChain
    }

    override fun dispense(currency: Currency) {
        if (currency.amount >= 10) {
            val num = currency.amount / 10
            val remainder = currency.amount % 10

            println("Dispensing $num $10 note")

            when {
                remainder != 0 -> this.chain.dispense(Currency(remainder))
            }
        } else {
            this.chain.dispense(currency)
        }
    }
}