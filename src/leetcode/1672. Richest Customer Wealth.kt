package leetcode

fun main() {

    println(maximumWealth(arrayOf(intArrayOf(2,8,7),intArrayOf(1,3,7),intArrayOf(1,9,5)))
    )
}
fun maximumWealth(accounts: Array<IntArray>): Int {


    return accounts.maxByOrNull { it.sum() }?.sum()!!
//    var maximumWealth = 0
//
//    val accountsWealthSum = Array(accounts.size){0}
//
//    accounts.forEachIndexed {index , acount ->
//
//        accountsWealthSum[index] = acount.sum()
//    }
//
//    accountsWealthSum.forEach {
//        if (it > maximumWealth) maximumWealth =it
//    }
//    return  maximumWealth
}