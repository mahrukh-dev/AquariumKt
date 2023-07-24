package aquarium.generics
open class Vehicle
class Car : Vehicle()
class Motorcycle : Vehicle()

class Garage<T : Vehicle> {
    private val vehicles = mutableListOf<T>()

    fun park(vehicle: T) {
        vehicles.add(vehicle)
    }

    fun getVehicles(): List<T> {
        return vehicles
    }
}


