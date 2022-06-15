package leetcode

import java.lang.StringBuilder

fun runningSum(nums: IntArray): IntArray {

    if (nums.isEmpty()) return nums
    val sumArray = IntArray(nums.size)

    sumArray[0] = nums[0]
    for (i in 1 until nums.size){
        sumArray[i] = nums[i] + sumArray[i-1]
    }
    return sumArray
}

fun shiftLatter(s : String , n : Int): String {
    val shiftingResult = StringBuilder()
    s.forEach {
        val charCode = it.code
        var shiftedCharCode = charCode + n
        if (shiftedCharCode > 122) shiftedCharCode -=26

        shiftingResult.append(shiftedCharCode.toChar())

    }
    return shiftingResult.toString()
}

fun main() {
//    val result = runningSum(intArrayOf())
//    result.forEach {
//        println(it)
//    }
    val res = shiftLatter("m",18)
    println(res)
}
