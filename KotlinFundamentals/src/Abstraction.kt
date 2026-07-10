abstract class Animal {
    abstract fun bark()
     open fun eat() {
        println("Animal is eating")
    }
}

class Dog : Animal() {
    override fun bark() {
        println("Dog is barking")
    }
}

fun main() {
    val dog = Dog()
    dog.bark()
    dog.eat()
}