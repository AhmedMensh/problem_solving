package leetcode

fun main() {
    print(multiply("123", "456"))
}

fun multiply(num1: String, num2: String): String {


    val n1 = num1.reversed()
    val n2 = num2.reversed()
    var result = 0
    var reminder = 0
    for (i in n2.indices) {
        var x = 0
        for (j in n1.indices) {
            val y = ((n2[i]).toString().toInt() * (n1[j]).toString().toInt()) + reminder
            reminder = y / 10

            x += (y % 10) * getFactor(i + j)

        }
        result += x
    }


    return result.toString()
}

fun getFactor(i: Int): Int {
    var factor = 1
    for (j in 1..i) {
        factor *= 10
    }

    return factor
}