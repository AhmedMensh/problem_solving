package leetcode

fun main() {

    print(
        checkStraightLine(
            arrayOf(
                intArrayOf(1, 2),
                intArrayOf(2, 3),
                intArrayOf(3, 4),
                intArrayOf(4, 5),
                intArrayOf(5, 6),
                intArrayOf(6, 7)
            )
        )
    )
}



fun checkStraightLine(coordinates: Array<IntArray>): Boolean {
    if (coordinates.size == 2) return true
    val x0 = coordinates[0][0]
    val x1 = coordinates[1][0]
    val y0 = coordinates[0][1]
    val y1 = coordinates[1][1]
    val dx = x1 - x0
    val dy = y1 - y0
    for (i in 2 until coordinates.size) {
        val x = coordinates[i][0]
        val y = coordinates[i][1]
        if (dy * (x - x0) != dx * (y - y0)) return false
    }
    return true
}