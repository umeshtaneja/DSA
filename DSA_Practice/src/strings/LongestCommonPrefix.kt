package strings

fun main() {
    val input = arrayOf("flower","flow","flight")
    println(longestCommonPrefix(input))
}

fun longestCommonPrefix(strs: Array<String>): String {

    if (strs.isEmpty()) return ""

    val first = strs[0]

    for (i in first.indices) {

        val current = first[i]

        for (j in 1 until strs.size) {

            if (i >= strs[j].length || strs[j][i] != current) {
                return first.substring(0, i)
            }
        }
    }

    return first
}