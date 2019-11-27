package design.patterns.behavioral.template.example

fun main() {
    var houseType: HouseTemplate = WoodenHouse()
    houseType.buildHouse()

    println("***************")

    houseType = GlassHouse()
    houseType.buildHouse()
}