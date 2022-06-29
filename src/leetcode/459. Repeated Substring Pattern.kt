package leetcode

fun main() {

    print(repeatedSubstringPattern("abaababaab")
    )
}
fun repeatedSubstringPattern(s: String): Boolean {

    if (s.length == 1) return false

    var c = s.length /2
    var isRepeated = false

    while ( c >= 1){

        val  subStrings = s.chunked(c)

        for (i in 0 until subStrings.lastIndex){
            if (subStrings[i] == subStrings[i+1]){
                isRepeated = true
            }
            else{
                isRepeated = false
                break
            }
        }
        if (isRepeated) return true
        c--
    }
    return isRepeated
}