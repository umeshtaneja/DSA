fun higherOrderFun (a:Int, b:Int , myFunction: (a:Int,b:Int) -> Int){
    println(myFunction(a,b))
}

fun main() {
    higherOrderFun(6,6){ a, b -> a + b }

}
