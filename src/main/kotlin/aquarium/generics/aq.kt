package aquarium.generics
open class WaterSupply(var needsProcessed: Boolean)
class TapWater : WaterSupply(true) {
    fun addChemicalCleaners() {
        needsProcessed = false
    }
}
class FishStoreWater : WaterSupply(false)
class LakeWater : WaterSupply(true) {
    fun filter() {
        needsProcessed = false
    }
}
class AquariumTwo<T: WaterSupply>(val waterSupply: T)

