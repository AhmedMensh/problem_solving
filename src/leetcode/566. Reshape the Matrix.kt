package leetcode

fun main() {
    matrixReshape(
        arrayOf(
            intArrayOf(1, 2, 3),
            intArrayOf(4, 5, 6),
        ),
        3, 3
    )
}
fun matrixReshape(mat: Array<IntArray>, r: Int, c: Int): Array<IntArray>? {
    if (mat.isEmpty() || r * c != mat.size * mat[0].size) return mat
    val ans = Array(r) { IntArray(c) }
    var k = 0
    for (row in mat) for (num in row) {
        ans[k / c][k % c] = num
        ++k
    }
    return ans
}