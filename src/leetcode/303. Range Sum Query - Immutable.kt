package leetcode

fun main() {
    print(NumArray(intArrayOf(-2,0,3,-5,2,-1)).sumRange(0,5))
}
class NumArray(var nums: IntArray) {

    fun sumRange(left: Int, right: Int): Int {
        var sum = 0
        for (i in left..right){
            sum+=nums[i]
        }
        return sum
    }
}
