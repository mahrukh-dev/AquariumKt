import aquarium.Aquarium
import aquarium.generics.*

fun main(){
    //pairs()
    //lists()
    //mapping()
    practice()

}

fun pairs(){
    val equipment = "fishnet" to "catching fish" to "of big size" to "and strong"
    println(equipment.first)
    println(equipment.second)
    println(equipment)
    println( equipment.first.first)

    val fishnet = "fishnet" to "catching fish"
    val (tool, use) = fishnet
    println("the $tool is a tool for $use")
}

fun lists(){
   // val testList = listOf(11,12,13,14,15,16,17,18,19,20)
   // listOf<Int>(1,2,3,4,5,6,7,8,9,0).reversed()
    var symptoms = mutableListOf("white spots", "red spots", "not eating", "bloated", "belly up")
    symptoms.add("white fungus")
    symptoms.remove("white fungus")
    symptoms.contains("red")
    println(symptoms.subList(4, symptoms.size))
    listOf(1, 5, 3).sum()
    listOf("a", "b", "cc").sumBy { it.length }
}

fun mapping(){
    val cures = hashMapOf("white spots" to "Ich", "red sores" to "hole disease")
    println(cures["white spots"])
    cures.getOrDefault("bloating", "sorry, I don't know")
    cures.getOrElse("bloating") {
        "No curefor this"
        //lambda function
    }
    val inventory = mutableMapOf("fish net" to 1)
    inventory.put("tank scrubber", 3)
}

fun practice(){
    val allBooks = setOf("Macbeth", "Romeo and Juliet", "Hamlet", "A Midsummer Night's Dream")
    val library = mapOf("Shakespeare" to allBooks)
    println(library.any { it.value.contains("Hamlet") })
    val moreBooks = mutableMapOf<String, String>("Wilhelm Tell" to "Schiller")
    moreBooks.getOrPut("Jungle Book") { "Kipling" }
    moreBooks.getOrPut("Hamlet") { "Shakespeare" }
    println(moreBooks)
}

fun workWithGenericClass() {
    val intList: MyList<Int>
    val fishList: MyList<Aquarium>
}

fun genericsExample() {
    val aquarium = AquariumTwo(TapWater())
    aquarium.waterSupply.addChemicalCleaners()
}

fun genericExampleTwo() {
    val carGarage = Garage<Car>()
    val bikeGarage = Garage<Motorcycle>()

    val car = Car()
    val bike = Motorcycle()

    carGarage.park(car)
    bikeGarage.park(bike)

    val parkedCars = carGarage.getVehicles()
    val parkedBikes = bikeGarage.getVehicles()

    println("Parked cars: $parkedCars")             // Output: Parked cars: [Car@<hashcode>]
    println("Parked bikes: $parkedBikes")           // Output: Parked bikes: [Motorcycle@<hashcode>]
}