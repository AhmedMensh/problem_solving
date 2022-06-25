package leetcode

fun main() {

    print(numIdenticalPairs(intArrayOf(1,1,1,1))
    )
}
fun numIdenticalPairs(nums: IntArray): Int {

    var count = 0
    val hashMap : HashMap<Int,Int> = hashMapOf()

    nums.forEach {

        hashMap[it] = hashMap[it]?.plus(1) ?:1
    }

     hashMap.values.forEach {

         count += (it*(it-1)) /2
    }
    return count
}