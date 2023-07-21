//STRINGS
//IF STATEMENT
//WHEN STATEMENT

fun main(){}

fun PracticeOne(){
    var fishOne: String = "trout"
    var fishTwo: String = "haddock"
    var fishThree: String = "snapper"
    println("i like $fishOne and $fishTwo but do not like $fishThree")
}

fun PracticeTwo(){
    var fishname = "fish"
    when(fishname.length){
        0 -> println("Error")
        in 3..12 -> println("Good fish name")
        else -> println("ok fish name")
    }
}