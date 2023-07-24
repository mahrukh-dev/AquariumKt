// A simple generic interface to produce values of type T
interface Producer<out T> {
    fun produce(): T
}

// A class hierarchy
open class Fruit
class Apple : Fruit()
class Banana : Fruit()

// Implementation of the Producer interface with Apple
class AppleProducer : Producer<Apple> {
    override fun produce(): Apple {
        return Apple()
    }
}

fun main() {
    val appleProducer: Producer<Apple> = AppleProducer()
    val fruitProducer: Producer<Fruit> = appleProducer // Covariance using "out"

    val apple: Apple = appleProducer.produce()
    val fruit: Fruit = fruitProducer.produce()

    println("Apple: $apple")
    println("Fruit: $fruit")
}
