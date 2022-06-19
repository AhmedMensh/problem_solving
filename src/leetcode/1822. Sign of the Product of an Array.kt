package leetcode

fun main() {

    val res= arraySign(intArrayOf(9,72,34,29,-49,-22,-77,-17,-66,-75,-44,-30,-24))
    print(res)
}

fun arraySign(nums: IntArray): Int {


    var negativeNumbers = 0

    nums.forEach {
        if (it == 0) return 0
        else if (it < 0) negativeNumbers++

    }
    return if(negativeNumbers% 2 ==0) 1 else -1
}