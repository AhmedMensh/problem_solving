fun main() {
    print(sockMerchant(arrayOf(10, 20, 10, 20,10, 30)))
}

/*
* There is a large pile of socks that must be paired by color.
*  Given an array of integers representing the color of each sock,
* determine how many pairs of socks with matching colors there are.
* */
fun sockMerchant(ar: Array<Int>): Int {
    // Write your code here
    var numberOfPairs = 0
    val hashMab = mutableMapOf<Int, Int>()
    ar.forEach { num ->
        if (hashMab.containsKey(num)) {
             numberOfPairs++
            hashMab.remove(num)

        } else {
            hashMab[num] = 1
        }
    }
    return numberOfPairs
}
