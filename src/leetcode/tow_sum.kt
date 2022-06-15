package leetcode

fun twoSum(nums: IntArray, target: Int): IntArray {

    val result  = IntArray(2)
    for(i in nums.indices){
        for (j in i+1 until nums.size){
            if (nums[i] + nums[j] == target){
                result[0] = i
                result[1] = j
                break
            }
        }
    }
    return result
}

fun main() {
    val result = twoSum( intArrayOf(3,2,3),6)
    result.forEach {
        println(it)
    }
}