package leetcode

fun main() {
    kidsWithCandies(intArrayOf(2,3,5,1,3),3)
}
fun kidsWithCandies(candies: IntArray, extraCandies: Int): List<Boolean> {

    val result : MutableList<Boolean> = mutableListOf()
    val maxCandies = candies.maxOf { it }

    candies.forEach {
        if (it +extraCandies >= maxCandies) result.add(true)
        else result.add(false)
    }
    return result
}