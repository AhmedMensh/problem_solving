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

fun matrixReshape(mat: Array<IntArray>, r: Int, c: Int): Array<IntArray> {

    val originalMatRows = mat.size
    val originalMatColumns = mat[0].size

    if (r * c != originalMatRows * originalMatColumns || (originalMatColumns == c && originalMatRows == r)) return mat

    var shapedMat = Array(r){ intArrayOf()}


    for (i in mat.indices){
        for (j in mat[i].indices){
            val arr = intArrayOf()

        }
    }
    return mat
}