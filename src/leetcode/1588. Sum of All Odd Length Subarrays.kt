package leetcode


fun main() {
    print(sumOddLengthSubarrays(intArrayOf(10,11,12))
    )
}
fun sumOddLengthSubarrays(arr: IntArray): Int {

    var prefixSum  = 0
    val prefixSumArr : MutableList<Int> = mutableListOf()
    var temp = 0
    for (i in arr.indices){
        prefixSum = 0
        temp = 0
        for (j in i until arr.size){
            if ((j-i) %2 ==0){
                prefixSum += arr[j] + temp
                prefixSumArr.add(prefixSum)
                temp = 0
            }else {
                temp = arr[j]
            }
        }
    }
    return prefixSumArr.sum()
}