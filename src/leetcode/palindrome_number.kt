package leetcode

fun isPalindrome1(x: Int): Boolean {

    var number = x
    if (x < 0 || (x % 10 ==0 && x != 0)) return false

    var revertedNumber = 0

    while (number > revertedNumber){
        revertedNumber = revertedNumber * 10 + number % 10
        number /= 10
    }
    return  number == revertedNumber || number == revertedNumber/10
}
fun isPalindrome(x: Int): Boolean {

    val xArray = x.toString().toCharArray()
    val center = xArray.size/2
    var start = center
    var end = center

    if (xArray.size %2 == 0){
        start = center -1
    }

    while (start >= 0 && end< xArray.size){
        if (xArray[start] != xArray[end]) return false
        start--
        end++
    }

    return true
}

fun main() {
    println(isPalindrome1(325523))
}