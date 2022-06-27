package leetcode

fun main() {
    print(
        isMonotonic(intArrayOf(1, 2, 2, 3))
    )
}

fun isMonotonic(nums: IntArray): Boolean {

    if (nums.size == 1) return true
    if (nums.first() <= nums.last()){
        for (i in 0 until nums.size - 1) {
            if (nums[i] > nums[i + 1]) {
                return false
            }
        }
    }else {
        for (i in 0 until nums.size - 1) {
            if (nums[i] < nums[i + 1]) {
                return false
            }
        }
    }

    return true
}
