package leetcode

import kotlin.math.abs

fun main() {

    val res = nearestValidPoint(1, 1, arrayOf( intArrayOf(1, 1),intArrayOf(1, 1)))
    print(res)
}

fun nearestValidPoint(x: Int, y: Int, points: Array<IntArray>): Int {

    if (points.isEmpty()) return -1
    var nearestPoint = Int.MAX_VALUE
    var nearestIndex = -1


    for (i in 0..points.lastIndex) {
        val manhattanDistance = Math.abs(x - points[i][0]) + abs(y - points[i][1])
        if ((x == points[i][0] || y == points[i][1]) && manhattanDistance < nearestPoint) {
            nearestPoint = manhattanDistance
            nearestIndex = i
        }

    }

    return nearestIndex
}