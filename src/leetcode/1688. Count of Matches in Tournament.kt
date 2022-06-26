package leetcode

fun main() {
    print(numberOfMatches(4)
    )
}
fun numberOfMatches(n: Int): Int {

    var num = n
    var numberOfMatches = 0

    while (num > 1){
        val x = num /2
        numberOfMatches += x
        num -= x
    }

    return numberOfMatches
}
