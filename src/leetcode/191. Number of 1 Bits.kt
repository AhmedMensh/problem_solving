package leetcode

fun main() {

    print(
        hammingWeight(512)
    )
}

fun hammingWeight(n: Int): Int {

    var number = n
    var ones = 0
    while (number !== 0) {
        ones += (number and 1)
        number = number ushr 1
    }
    return ones
//    return n.toString().count { it == '1' }
}