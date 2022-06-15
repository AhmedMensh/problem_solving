import kotlin.io.*
import kotlin.text.*

/*
 * Complete the 'repeatedString' function below.
 *
 * The function is expected to return a LONG_INTEGER.
 * The function accepts following parameters:
 *  1. STRING s
 *  2. LONG_INTEGER n
 */

fun repeatedString(s: String, n: Long): Long {
    // Write your code here
    var numberOfRepeatedALatterAtSubString = 0L
    var numberOfRepeatedALatter = 0L
    for (element in s) {
        if (element == 'a') numberOfRepeatedALatterAtSubString++
    }
    numberOfRepeatedALatter = numberOfRepeatedALatterAtSubString * (n / s.length)

    for (i in 0 until n % s.length) {
        if (s[i.toInt()] == 'a') numberOfRepeatedALatter++
    }

    return numberOfRepeatedALatter
}

fun repeatedString1(s: String, n: Long): Long {
    // Write your code here

    val cycleCount = s.count { it == 'a' }
    val cycles = n / s.length
    val reminderRang = (n % s.length).toInt()
    val reminderCount = s.substring(0,reminderRang)
    val total  = ((cycles * cycleCount) + reminderCount.count{it == 'a'})

    return total
}

fun main(args: Array<String>) {
//    val s = readLine()!!
//
//    val n = readLine()!!.trim().toLong()

    val result = repeatedString1("aba", 10)

    println(result)


}
