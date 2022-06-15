package leetcode


fun main() {

    val list = listOf("sdfsdf.jpg","sfsdfdf.jpg","sdsdgdsg.jpg")
    val res = list.map { it.ifBlank{"sdsd"} }
    print(res.toString())
}
val result : MutableList<MutableList<Int>> = mutableListOf()
//fun permute(nums: IntArray): List<List<Int>> {
//
//
//
//}
//
//fun getFactorial(n : Int) : Int{
//    if (n == 1) return 1
//    return n * getFactorial(n-1)
//}