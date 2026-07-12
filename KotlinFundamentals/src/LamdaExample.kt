val result = { a: Int, b: Int -> a * b }

val greet = { name : String -> "Welcome to home $name" }

fun main() {
    val output = result(5,6)
    println(output)
    
    println(greet("Umesh"))
}