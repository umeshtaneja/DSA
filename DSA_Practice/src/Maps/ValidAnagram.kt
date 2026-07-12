package Maps

fun main() {
    // s = listen , t = silent
    // fist approach sort and compare, if same then valid anagram

    val s = "listenn"
    val t = "silent"
    val result = isValidAnagram(s,t)
    println("$result")
}

fun isValidAnagram(s : String,t:String): Boolean{

    val charArray_S = s.toCharArray()
    val charArray_T = t.toCharArray()
    if (charArray_S.size != charArray_T.size) return false

    val map = HashMap<Char,Int>()

    for(char in charArray_S){
        map[char] = map.getOrDefault(char,0)+1
    }

    for(char in charArray_T) {
        val count = map[char] ?: return false
        if(count == 1) map.remove(char)
        else map[char] = count-1
    }
    return map.isEmpty()
}