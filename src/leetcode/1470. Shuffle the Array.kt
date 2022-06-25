package leetcode

fun main() {

    shuffle(intArrayOf(2, 5, 1, 3, 4, 7), 3).forEach { println(it) }
}

fun shuffle(nums: IntArray, n: Int): IntArray {

    val res = IntArray(nums.size) { 0 }
    var index = 0
    for (i in 0 until n) {
        res[index++] = nums[i]
        res[index++] = nums[n + i]
    }
    return res
}