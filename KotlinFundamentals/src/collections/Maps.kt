package collections

import kotlin.collections.iterator

fun main() {
    val myMap = HashMap<Int,String>()
    myMap[1] = "umesh"
    myMap[2] = "Prag"
    /*for ((key,value) in myMap) {
        println(value)
    }*/
    println(myMap.remove(1))
    println()

    for ((key,value) in myMap) {
        println(value)
    }
    println()
    println(myMap.size)
}
