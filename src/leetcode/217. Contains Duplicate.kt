package leetcode

fun main() {

    print(containsDuplicate(intArrayOf(1,2,3,1))
    )
}
fun containsDuplicate(nums: IntArray): Boolean {

    val hashSet : HashSet<Int> = hashSetOf()

    nums.forEach {
        if (hashSet.contains(it)) return true
        hashSet.add(it)
    }

    return false
}