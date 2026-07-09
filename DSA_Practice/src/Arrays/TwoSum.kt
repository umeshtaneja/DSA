package Arrays

fun main() {
    val input = intArrayOf(2,3,7,10)
    val target = 9

    val result = getIndex(input, target)
    println(result.contentToString())
}

fun getIndex(input: IntArray, target: Int): IntArray{
    val map = HashMap<Int,Int>()
    for (i in input.indices){
        val complement = target - input[i]
        if(map.containsKey(complement)){
            return intArrayOf(map[complement]!!,i)
        }
        map[input[i]] = i
    }
    return intArrayOf()
}