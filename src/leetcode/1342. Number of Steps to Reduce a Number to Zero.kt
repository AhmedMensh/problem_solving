package leetcode

fun main() {
    print(numberOfSteps(14))
}
fun numberOfSteps(num: Int): Int {

    var n = num
    var numberOfSteps = 0

    while (n != 0){
        numberOfSteps++
        if (n % 2 == 0) n/=2
        else n--
    }

    return numberOfSteps
}