

fun main() {

    birthdayCakeCandles(arrayOf(2, 5, 10, 10, 4))
}

// Complete the birthdayCakeCandles function below.
fun birthdayCakeCandles(ar: Array<Int>): Int {

    ar.sortDescending()
    var numberOfTallestCandles = 0
    for (i in ar.indices) {
        if (ar[i] == ar[0]) numberOfTallestCandles++
        else break

    }
    return numberOfTallestCandles
}
