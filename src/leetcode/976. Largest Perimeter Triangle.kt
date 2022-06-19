package leetcode

import java.util.*

fun main() {
    val res = largestPerimeter(intArrayOf(3, 2, 3,4))
    print(res)
}

fun largestPerimeter(nums: IntArray): Int {


    Arrays.sort(nums)


    for (i in nums.size -3 downTo  0){
        if (nums[i]+nums[i+1] > nums[i+2])
            return(nums[i]+nums[i+1] + nums[i+2])
    }
    return 0
}