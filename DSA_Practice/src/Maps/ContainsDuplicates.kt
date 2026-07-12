package Maps


// check if duplicates - // 1,2,3,1 -> yes
fun main() {

    val input = intArrayOf(1,2,3,4,5,6,7,8,9,10)
    println(isContainsDuplicates(input))

}

fun isContainsDuplicates(input : IntArray) : Boolean {
    val myMap = HashMap<Int,Int>()

    // can also be solved using HashSet - same time and space complexity

    for (item in input) {
        if (myMap.containsKey(item)) {
            return true
        }
        myMap[item] = 0
    }
    return false
}