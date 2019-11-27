package design.patterns.behavioral.template.example

abstract class HouseTemplate {

    fun buildHouse() {
        buildFoundation()
        buildPillars()
        buildWalls()
        buildWindows()
    }

    private fun buildWindows() {
        println("Building Glass Windows")
    }

    abstract fun buildWalls()
    abstract fun buildPillars()

    private fun buildFoundation() {
        println("Building foundation with cement, iron rods and sand")
    }
}

class WoodenHouse : HouseTemplate() {

    override fun buildWalls() {
        println("Building Wooden Walls")
    }

    override fun buildPillars() {
        println("Building Wooden Pillars with wood coating")
    }
}

class GlassHouse : HouseTemplate() {

    override fun buildWalls() {
        println("Building Glass Walls")
    }

    override fun buildPillars() {
        println("Building Wooden Pillars with glass coating")
    }
}