class Consumer<in T> {
    fun consume(item: T) {
        println("Consuming: $item")
    }
}

fun main() {
    val consumer: Consumer<Number> = Consumer()
    consumer.consume(42) // OK, since Consumer is contravariant
    consumer.consume(3.14) // OK, since Consumer is contravariant
}

