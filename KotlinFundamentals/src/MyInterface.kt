interface MyInterface {
    fun bark()
}

class MyDog : MyInterface {
    override fun bark() {
        println("Dog bark")
    }
}

fun main() {
    val dog = MyDog()
    dog.bark()
}