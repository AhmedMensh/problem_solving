import kotlin.io.*


/*
 * Complete the 'makeAnagram' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. STRING a
 *  2. STRING b
 */

// c d e = j
// a b c = i
fun makeAnagram(a: String, b: String): Int {
    // Write your code here

    val hashMap = mutableMapOf<Char,Int>()
    a.forEach {
        if (hashMap.containsKey(it)){
            val charValue : Int = hashMap.get(it) ?: 0
            hashMap[it] = charValue.plus(1)
        }else{
            hashMap[it] = 1
        }
    }

    b.forEach {
        if (hashMap.containsKey(it)){
            val charValue : Int = hashMap.get(it) ?: 0
            hashMap[it] = charValue.minus(1)
        }else{
            hashMap[it] = -1
        }
    }

    var total = 0
    hashMap.values.forEach {
        total += Math.abs(it)
    }
    return total
}

fun main(args: Array<String>) {
    val a = readLine()!!

    val b = readLine()!!

    val res = makeAnagram(a, b)

    println(res)


}
