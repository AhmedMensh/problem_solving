package leetcode

import java.util.*

fun main() {
    print(canMakeArithmeticProgression(intArrayOf(1,2,4))
    )
}
fun canMakeArithmeticProgression(arr: IntArray): Boolean {

    Arrays.sort(arr)
    for (i in 0 .. arr.lastIndex-2){
        if (arr[i] - arr[i+1] != arr[i+1] - arr[i+2]) return false
    }
    return true
}