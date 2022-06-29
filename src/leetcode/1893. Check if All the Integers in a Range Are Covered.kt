package leetcode

fun main() {
    print(isCovered(arrayOf(intArrayOf(1,2),intArrayOf(3,4),intArrayOf(5,6)),2,5)
    )
}
fun isCovered(ranges: Array<IntArray>, left: Int, right: Int): Boolean {

    ranges.forEach {

        if (left !in it[0] .. it[1] && right !in it[0] .. it[1]) return false
    }

    return true
}