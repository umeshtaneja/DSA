fun String.isPalindrome() : Boolean {
    return this.reversed() == this
}

fun Int.square(): Int{
    return this * this
}

fun main() {
    
    println(5.square())

    println("madam".isPalindrome())
}