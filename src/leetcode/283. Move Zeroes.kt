package leetcode

fun main() {

    moveZeroes(intArrayOf(0,1,0,3,12))
}
fun moveZeroes(nums: IntArray): Unit {

    for (i in nums.indices) {

            for (j in 0 until nums.size-i-1) {
                if (nums[j] == 0) {
                val temp = nums[j+1]
                nums[j] = temp
                nums[j+1] = 0
            }}

    }

}