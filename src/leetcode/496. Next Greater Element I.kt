package leetcode

fun main() {
    nextGreaterElement(intArrayOf(2,4), intArrayOf(1,2,3,4))
}
fun nextGreaterElement(nums1: IntArray, nums2: IntArray): IntArray {

    val ans  = IntArray(nums1.size){-1}

    for (i in nums1.indices){
        val numberIndex = nums2.indexOf(nums1[i])

        for (j in numberIndex..nums2.lastIndex){
            if (nums2[j] > nums1[i]) {
                ans[i] = nums2[j]
                break
            }
        }
    }


    return ans
}