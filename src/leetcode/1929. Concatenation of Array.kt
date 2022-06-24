package leetcode

fun main() {

    getConcatenation(intArrayOf(1, 2, 1)).forEach {
        print(it)
    }
}

fun getConcatenation(nums: IntArray) = IntArray(nums.size * 2) {
    return nums + nums
}

//    for (i in ans.indices) {
//        ans[i] = nums[i % nums.size]
//    }
//    return ans
