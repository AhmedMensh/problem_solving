package leetcode

fun main() {

    sortByBits(intArrayOf(0,1,2,3,4,5,6,7,8)).forEach {
        println(it)
    }
}
fun sortByBits(arr: IntArray): IntArray {

    for (i in arr.indices){
        for (j in 0 until arr.size-i-1){

            if (arr[j].countOneBits() > arr[j+1].countOneBits()){
                val temp = arr[j]
                arr[j] = arr[j+1]
                arr[j+1] = temp
            }
        }
    }
    return arr
}