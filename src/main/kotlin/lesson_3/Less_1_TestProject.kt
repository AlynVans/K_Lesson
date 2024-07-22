fun main() {
    val pocophone = Smartphone("Pocophone", "Pocophone F1", 6, 128, 6000, 300) // Можно так (1)
//    pocophone.model = "Pocophone F1"      //Можно так (2)
//    pocophone.name = "Poco"
//    pocophone.ram = 6
//    pocophone.memory = 128
//    pocophone.battery = 6000
//    pocophone.price = 300
    pocophone.allSpecifications()
    pocophone.checkBattery()

}

class Smartphone(
    var name: String = "Undefined", //Можно так (1)
    var model: String = "Undefined",
    var ram: Int = 0,
    var memory: Int = 0,
    var battery: Int = 0,
    var price: Int = 0,
)
//var name: String = "Undefined" //Можно так (2)
//var model: String = "Undefined"
//var ram: Int = 0
//var memory: Int = 0
//var battery: Int = 0
//var price: Int = 0
{
    fun allSpecifications() {
        println(
            """
            Name = $name
            Model = $model
            RAM = $ram GB
            Memory = $memory GB
            Battery = $battery mAh
            Price = $price $
        """.trimIndent()
        )
    }

    fun checkBattery() {
        val batteryStatus = if (battery > 3000) "High capacity" else "Standard capacity"
        println("Battery status: $batteryStatus")
    }
}