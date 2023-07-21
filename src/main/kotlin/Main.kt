fun main(args: Array<String>) {
    operators()
}

fun operators(){
    val fish = 2
    fish.times(6)
    fish.div(10)
    fish.minus(3)
    fish.plus(10)

    1.toLong()

    val boxed:Number =1
    boxed.toLong()

    val b: Byte =1
    val i: Int = b.toInt()

}
fun nullability(){
    var marbles: Int? = null
    var lotsOfFish: List<String?> = listOf(null, null)
    var evenMoreFish: List<String>? = null
    var definatelyFish: List<String?>? = null
}