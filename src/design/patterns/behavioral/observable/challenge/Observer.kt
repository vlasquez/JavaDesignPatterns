package design.patterns.behavioral.observable.challenge

interface Observer {
    fun update(runs: Int, wickets: Int, overs: Float)
}

class AverageScoreDisplay() : Observer {
    var runRate: Float? = null
    var predictedScore: Int? = null

    override fun update(runs: Int, wickets: Int, overs: Float) {
        runRate = runs / overs
        this.predictedScore = (runRate!! * 50).toInt()
        display()
    }

    fun display() {
        println(
            "\nAverage Score Display: \n " +
                    "Run Rate: $runRate " +
                    "\nPredictedScore: $predictedScore"
        )
    }
}

class CurrentScoreDisplay : Observer {
    var runs: Int? = null
    var wickets: Int? = null
    var overs: Float? = null

    override fun update(runs: Int, wickets: Int, overs: Float) {
        this.runs = runs
        this.wickets = wickets
        this.overs = overs
        display()
    }

    fun display() {
        println(
            "\nCurrent Score Display: \n " +
                    "Run Rate: $runs " +
                    "\nPredictedScore: $wickets" +
                    "\nOvers: $overs"
        )
    }

}