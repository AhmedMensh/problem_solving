import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

/*
 * Complete the 'jumpingOnClouds' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts INTEGER_ARRAY c as parameter.
 */

fun jumpingOnClouds(c: Array<Int>): Int {
    // Write your code here
    var i = 0
    var numberOfJumps =0

    if (c.size == 2) return  1
    while (i < c.size-2){
        numberOfJumps++
        i += if (c[i+1] == 1 ||  c[i+2] == 0)
            2
        else 1

        println("Result : ${c.size -i}")
        if ( c.size - i  ==2) numberOfJumps++
    }
    return numberOfJumps
}

fun main(args: Array<String>) {
//    val n = readLine()!!.trim().toInt()

    val c = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = jumpingOnClouds(c)

    println(result)
}
