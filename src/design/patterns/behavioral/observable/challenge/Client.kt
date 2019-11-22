package design.patterns.behavioral.observable.challenge

fun main() {
    val averageScoreDisplay = AverageScoreDisplay()
    val currentScoreDisplay = CurrentScoreDisplay()

    val cricketData = CricketData()

    cricketData.registerObserver(averageScoreDisplay)
    cricketData.registerObserver(currentScoreDisplay)

    cricketData.dataChanged()

    cricketData.unregisterObserver(averageScoreDisplay)
    cricketData.dataChanged()
}