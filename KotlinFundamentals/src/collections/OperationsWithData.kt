package collections

fun main() {
    val myList = mutableListOf(1,2,3,4,5)
    myList.add(10)
    myList.forEach { println(it) }
    println()
    mapFunction()
}

fun mapFunction() {
    val input = listOf(1,2,3,4,5)
    val qubes = input.map { it * it * it}
    println(qubes)
    println()
    FilterExample()
}

fun FilterExample(){
    val input = mutableListOf(10, 20, 55, 70, 90)
    val result = input.filter{
        it > 50
    }
    println(result)
    println()
    setDuplicates()
}

fun setDuplicates(){
    val mySet = mutableSetOf(1,2,3,4,5,2)
    println(mySet)
    println()
    myMap()
}

fun myMap(){
    val myMap = mutableMapOf(
        101 to "Umesh",
        102 to "Hrutika",
        103 to "Prag",
    )
    myMap[104] = "abc"
    
    for ((key, value) in myMap) println("$key -> $value")
}