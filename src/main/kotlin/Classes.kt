import aquarium.Aquarium

fun main(){
    //buildAquarium()
    delegate()
}

fun buildAquarium(){
    val myAquarium = Aquarium()

    println("Length = ${myAquarium.length}")
    println("Width = ${myAquarium.width}")
    println("Height = ${myAquarium.height}")

    myAquarium.height = 80
    println("Height = ${myAquarium.height}")

    println("Volume = ${myAquarium.volume}")
}

fun delegate(){
    val pFish = PFish()
    println("fish color = ${pFish.color}")
    pFish.eat()
}

interface FishAction{
    fun eat()
}
interface FishColor{
    val color:String
}
class PFish: FishAction, FishColor by GoldColor{
    override fun eat() {
        println("pf fish eating")
    }
}

object GoldColor: FishColor{
    override val color = "gold"
}