import kotlin.io.*
import kotlin.math.abs


/*
 * Complete the 'isValid' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts STRING s as parameter.
 */

fun isValid(s: String): String {
    // Write your code here
    val hashMap = HashMap<Char, Int>()
    s.forEach {
        if (hashMap.containsKey(it)) {
            val value: Int = hashMap.get(it) ?: 1
            hashMap[it] = value + 1
        } else hashMap[it] = 1
    }
    val mapValues = s.groupingBy { it }.eachCount().values.groupBy { it }.values.toList()
    val groupsSize = mapValues.size
    if (groupsSize == 1) return "YES"
    if (groupsSize > 2) return "NO"
    if (mapValues[0].size != 1 && mapValues[1].size != 1) return "NO"
    if (mapValues[0].size == 1 && mapValues[0][0] == 1) return "YES"
    if (mapValues[1].size == 1 && mapValues[1][0] == 1) return "YES"
    return if (abs(mapValues.first().first() - mapValues[1].first() ) == 1) "YES"
    else "NO"

}

fun main(args: Array<String>) {
    val s = readLine()!!

    val result = isValid(s)

    println(result)
}
