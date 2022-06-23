package leetcode
fun main() {
    buildArray(intArrayOf(0,2,1,5,3,4)).forEach {
        println(it)
    }
}
fun buildArray(nums: IntArray): IntArray {

    val ans = IntArray(nums.size)
    for (i in nums.indices){
        ans[i] = nums[nums[i]]
    }

    return ans
}