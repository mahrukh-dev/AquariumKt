//ARRAYS
//LOOPS
fun main(){}

fun Practice(){
    var numbers = intArrayOf(11,12,13,14,15)
    var mList = mutableListOf<String>()
    for (n in numbers){
        mList.add(n.toString())
    }
    var divSeven = mutableListOf<Int>()
    for(i in 0..100 step 7){
            divSeven.add(i)
    }
}