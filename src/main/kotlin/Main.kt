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

fun PracticeBasicOperators(){
    var fish = 2
    fish.plus(71).plus(233).minus(13).div(30).plus(1)
}

fun PracticeVariables(){
    var rainbowColor: String = "blue"
    rainbowColor = "red"
    val blackColor: String = "black"
}

fun PracticeNullability(){
    var greenColor = null
    var blueColor: Int? = null
}

fun PracticeNullabilityLists(){
    var listOne: List<String?> = listOf(null, null)
    var listTwo = listOf<String?>(null, null)
    var listThree: List<String?>? = null
}

fun PracticeNullCheck(){
    var nullTest: Int? = null
    var returnval = nullTest?.plus(1) ?: 0
    println(returnval)
}