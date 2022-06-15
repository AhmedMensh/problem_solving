import kotlin.math.abs

fun main() {

    val arr = arrayOf(arrayOf(11,2,4),arrayOf(4,5,6),arrayOf(10,8,-12))
    print(diagonalDifference(arr))
}





fun diagonalDifference(arr: Array<Array<Int>>): Int {
    // Write your code here

    var sumOfFirstDiagonal = 0
    var sumOfSecondDiagonal = 0
    val inverseDiagonalIndexesSum = arr.size -1
    for(i in arr.indices){
        for (j in arr[i].indices){
            if (i == j) sumOfFirstDiagonal += arr[i][j]
            if (i+j == inverseDiagonalIndexesSum) sumOfSecondDiagonal += arr[i][j]
        }
    }
    println(sumOfFirstDiagonal)
    println(sumOfSecondDiagonal)
    return abs(sumOfFirstDiagonal - sumOfSecondDiagonal)
}