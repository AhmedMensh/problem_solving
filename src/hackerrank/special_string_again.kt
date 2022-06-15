
import java.util.*
import kotlin.io.*
import kotlin.text.*

// Complete the substrCount function below.
fun substrCount(n: Int, s: String): Long {

    var i = 0
    var numberOfSpecialWords = 0L
    while (i < n){
        val subString = s.substring(i,n)
        if (subString.length == 2){
            if (subString[0] == subString[1]) numberOfSpecialWords++
            i++
            continue
        }
        var middel = subString.length /2
        if (subString.length % 2 == 0) middel--
        for (j in middel until subString.length-1){
            println("${subString[j+1]}")
            println("${subString[j-1]}")
            println("${subString[j+1].equals(subString[j-1])}")
            if (subString[j+1].equals(subString[j-1])){
                numberOfSpecialWords++
            }
            else break
        }
        i++
    }

    return numberOfSpecialWords
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val s = scan.nextLine()

    val result = substrCount(n, s)

    println(result)
}
