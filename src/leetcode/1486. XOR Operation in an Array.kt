package leetcode

fun main() {
    print(xorOperation(5,0)
    )
}
fun xorOperation(n: Int, start: Int): Int {

    var res = 0
    for (i in 0 until n){
        res = res xor start+2 * i
    }
    return res
}