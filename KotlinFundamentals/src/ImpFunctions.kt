import java.util.Locale
import java.util.Locale.getDefault

fun main() {
    val input = intArrayOf(1,2,3,4,5)
    val inputNames = listOf("umesh","taneja","Hrutika","Taneja")

    // map
    val output = input.map { it * it }
    println(input.contentToString())
    println(output)

    val uppercaseNames = inputNames.map { it -> it.uppercase() }
    println(uppercaseNames)

    //filter
    val even = input.filter { it % 2 != 0 }
    println(even)

    //Reduce - very useful in DS

    val numbers = listOf(10,40,80,20,110)
    var index = 0
    val result =  numbers.reduce { acc, i ->
        println("acc = $acc, i = $i")
        index += 1
        acc + i
    }
    println(result)

    // largest number using reduce

    val largestNumber = numbers.reduce { acc, i ->
        if(acc > i) acc else i
    }
    println(largestNumber)

}