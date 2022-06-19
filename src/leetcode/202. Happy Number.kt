package leetcode

fun main() {

    isHappy(19)
}
fun isHappy(n: Int): Boolean {

    val hashSet = hashSetOf<Int>()
    var number = n
    hashSet.add(n)
    while (number != 1){

        var result = 0
        while (number > 0){
            result += (number%10) * (number%10)
            number/=10
        }
        if (hashSet.contains(result)) return false
        hashSet.add(result)
        number = result

    }
    return true
}