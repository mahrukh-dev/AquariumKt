import java.util.Calendar
import java.util.Random

// FUNCTIONS
//AMS

fun main(){
    //println( getFortuneCookie())
    //feedTheFish()
    //println(whatShouldIDoToday(readLine()!!))
    filterExample()
}

var rollDice = {Random().nextInt(12)+1}
var rollDiceSides = {side: Int ->Random().nextInt(side)+1}
var rollDiceSides2 = {side: Int ->
    if(side==0) 0
    else Random().nextInt(side)+1
}
var rollDiceSides3: (Int)-> Int = {side ->
    if(side==0) 0
    else Random().nextInt(side)+1
}



fun filterExample(){
    val decor = listOf("rock", "plastic", "pet", "alligator")
    val filterOne = decor.filter { it.startsWith("p") }
    println(filterOne)

    //apply filter lazily
    val filterTwo = decor.asSequence().filter { it.startsWith("p") }
    println(filterTwo.toList())

    var spices = listOf("curry", "pepper", "cayenne", "ginger", "red curry", "green curry", "red pepper" )
    var spicesOne = spices.filter { it.contains("curry") }.sortedBy { it.length }
    var spicesTwo =    spices.filter { it.startsWith("c") }.filter { it.endsWith("e") }
    var spicesThree= spices.take(3).filter { it.startsWith("c") }
}

fun whatShouldIDoToday(mood:String, weather: String = "Sunny", temp: Int = 24): String {

    return when {
        mood =="happy" && weather== "Sunny" -> "go for a walk"
        mood == "sad" && weather == "rainy" && temp == 0 -> "stay in bed"
        temp > 35 -> "go swimming"
        else -> "stay home and read"
    }
}
fun dayOfWeek(){
    println("What day is it today?")
    var day = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)
    when(day){
        1-> println("Sunday")
        2-> println("Monday")
        3-> println("Tueday")
        4-> println("Wednesday")
        5-> println("Thursday")
        6-> println("Friday")
        7-> println("Saturday")
        else -> println("Error")
    }
}

fun mainTwo(t: String){
    var time = t.toInt()
    if (time<12){
        println("Good Morning, Kotlin")
    }
    else {
        println("Good Night, Kotlin")
    }
}

fun randomDay(): String {
    val week = listOf<String>("Mon", "Tue", "Wed", "Thur", "Fri", "sat", "Sun")
    return week[Random().nextInt(7)]
}

fun feedTheFish(){
    val day = randomDay();
    val food = fishFood(day);
    println("Day = $day. food = $food")

}

fun fishFood(day: String): String{
    var food = ""
    when(day){
        "Mon"-> food = "f1"
        "Tue"-> food = "f2"
        "Wed"-> food = "f3"
        "Thur"-> food = "f4"
        "Fri"-> food = "f5"
        "sat"-> food = "f6"
        "Sun"-> food = "f7"
    }
    return food
}

fun getBirthday():Int{
    print("Enter your birthday")
    var birthday = readLine()?.toIntOrNull()
    while (birthday == null) {
        println("Invalid input. Please enter a valid number for your birthday.")
        print("Enter your birthday: ")
        birthday = readLine()?.toIntOrNull()
    }
    return birthday
}
fun getFortuneCookie(): String {
    val fortuneList = listOf<String>("You will have a great day!",
        "Things will go well for you today.",
        "Enjoy a wonderful day of success.",
        "Be humble and all will turn out well.",
        "Today is a good day for exercising restraint.",
        "Take it easy and enjoy life!",
        "Treasure your friends because they are your greatest fortune."
    )
    var birthday = getBirthday()
    when(birthday){
        in 1..7 -> return "week one forturne"
        28, 31-> return "28/31 fortune"
        else -> return fortuneList[birthday % (fortuneList.size)]
    }

}

fun fitMoreFish(tankSize: Int, currentFish: ArrayList<Int>, fishSize: Int, hasDecor: Boolean): Boolean {
    var totalFishInches = 0
    for (f in currentFish){
        totalFishInches = totalFishInches + f
    }
    var gallons =tankSize
    if (hasDecor==true){
        gallons = (0.8 * tankSize).toInt()
    }
    var remainingArea = gallons - totalFishInches
    if(fishSize>=remainingArea){
        return true
    }
    else {
        return false
    }
}

