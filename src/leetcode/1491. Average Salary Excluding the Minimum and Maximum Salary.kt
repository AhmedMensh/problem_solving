package leetcode

fun main() {

    print(
        average(intArrayOf(4000, 3000, 1000, 2000))
    )
}

fun average(salary: IntArray): Double {

    val sortedSalaries = salary.sorted()
    var totalSalaries = 0.0
    for (i in 1 until sortedSalaries.lastIndex) {
        totalSalaries += sortedSalaries[i]
    }

    return (totalSalaries / (sortedSalaries.size - 2))
}