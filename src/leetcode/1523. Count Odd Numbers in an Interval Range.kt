package leetcode

fun main() {
   val res =  countOdds(21,22)
    print(res)
}

fun countOdds(low: Int, high: Int): Int {

    var oddNumbers = (high-low) / 2
    if (low %2 !=0 || high %2 !=0) oddNumbers +=1

    return oddNumbers
}