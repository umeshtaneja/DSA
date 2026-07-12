package collections
// no duplicates
fun main() {

    val mySet = HashSet<Int>()
    mySet.add(1)
    mySet.add(2)
    mySet.add(3)

    mySet.add(2)

    for (set in mySet) {
        println(set.toString())
    }

    println()
    mySet.remove(1)
    println(mySet.size)
}