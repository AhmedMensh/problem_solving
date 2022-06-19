package leetcode

fun main() {
    print(
        subtractProductAndSum(234)
    )
}

fun subtractProductAndSum(n: Int): Int {

    var number = n
    var productOfTheDigits = 1
    var sumOfTheDigits = 0

    while (number > 0) {
        val lastDigit = number % 10
        sumOfTheDigits += lastDigit
        productOfTheDigits *= lastDigit
        number /= 10
    }
    return (productOfTheDigits - sumOfTheDigits)
}