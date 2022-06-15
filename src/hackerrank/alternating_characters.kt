import kotlin.io.*
import kotlin.math.abs
import kotlin.text.*

/*
 * Complete the 'alternatingCharacters' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts STRING s as parameter.
 */

fun alternatingCharacters(s: String): Int {
    // Write your code here

    var deletionNumber = 0
    for (i in 0..s.length-2){
        if (s[i] == s[i+1]) deletionNumber++
    }
    return deletionNumber

}

fun main(args: Array<String>) {
//    val q = readLine()!!.trim().toInt()

//    for (qItr in 1..q) {
//        val s = readLine()!!
//
//        val result = alternatingCharacters(s)
//
//        println(result)
//    }

    val result = alternatingCharacters("AAAAA")

    println(result)
}
