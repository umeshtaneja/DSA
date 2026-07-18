package strings

fun main() {
    val input = ",,,,   A man, a plan, a canal: Panama:::::"
    val output = isValidPalindrom(input)
    println(output)
}
fun isValidPalindrom(input: String): Boolean {
    var left = 0
    var right = input.length - 1

    while (left < right) {

        while (left < right && !input[left].isLetterOrDigit()) {
            left++
        }

        while (left < right && !input[right].isLetterOrDigit()) {
            right--
        }

        if (input[left].lowercaseChar() != input[right].lowercaseChar()) {
            return false
        }

        left++
        right--

    }
    return true

}