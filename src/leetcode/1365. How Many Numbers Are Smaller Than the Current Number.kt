package leetcode

fun main() {
    smallerNumbersThanCurrent(intArrayOf(8,1,2,2,3)).forEach {
        println(it)
    }
}
fun smallerNumbersThanCurrent(nums: IntArray): IntArray {

    val res = IntArray(nums.size){0}

    for (i in nums.indices){
        var count = 0
        for (j in  nums.indices){
            if (nums[j] < nums[i]) count++
        }

        res[i] = count
    }
    return res
}