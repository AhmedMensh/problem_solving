package leetcode

fun main() {
    println(
        diagonalSum(arrayOf(intArrayOf(1, 2, 3), intArrayOf(4, 5, 6), intArrayOf(7, 8, 9)))
    )
}

fun diagonalSum(mat: Array<IntArray>): Int {

    var secondaryDiagonalIndex = mat.size - 1

    var sum = 0
    for (i in mat.indices) {
        sum += mat[i][i] +mat[i][secondaryDiagonalIndex--]
    }

    if (mat.size % 2 != 0) {
        val matCenter = mat.size / 2
        return sum - mat[matCenter][matCenter]
    }
    return sum
}