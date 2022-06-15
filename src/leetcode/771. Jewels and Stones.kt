package leetcode

fun main() {
    print(numJewelsInStones("Aa","aAAbbbb"))
}

fun numJewelsInStones(jewels: String, stones: String): Int {

    var result = 0
    stones.forEach {
        if (jewels.indexOf(it) != -1) result++
    }
    return result
}