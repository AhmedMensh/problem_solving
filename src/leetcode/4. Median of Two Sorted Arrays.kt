package leetcode

fun main() {
    val res = findMedianSortedArrays(intArrayOf(100000), intArrayOf(100001))
    println(res)



}
fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {

    val mergedArraySize = (((nums1.size + nums2.size)) /2) +1
    val mergedArr = IntArray( mergedArraySize)

    var firstArrIndex = 0
    var secondArrIndex = 0
    var mergedArrIndex = 0
    while ((firstArrIndex < nums1.size || secondArrIndex < nums2.size) && mergedArrIndex < mergedArr.size){

        when{
            firstArrIndex > nums1.size-1 -> {
                mergedArr[mergedArrIndex] = nums2[secondArrIndex]
                secondArrIndex++
            }
            secondArrIndex > nums2.size -1->{
                mergedArr[mergedArrIndex] = nums1[firstArrIndex]
                firstArrIndex++
            }
            nums1[firstArrIndex] <= nums2[secondArrIndex] ->{
                mergedArr[mergedArrIndex] = nums1[firstArrIndex]
                firstArrIndex++
            }
            else ->{
                mergedArr[mergedArrIndex] = nums2[secondArrIndex]
                secondArrIndex++
            }
        }
        mergedArrIndex++
    }


    if ((nums1.size + nums2.size ) % 2 !=0) return mergedArr.last().toDouble()

    return (mergedArr.last().toDouble() + mergedArr[mergedArr.lastIndex-1])/2
}