package leetcode


fun main() {
    plusOne(intArrayOf(9, 9, 9)).forEach { print(it) }
}

fun plusOne(digits: IntArray): IntArray {

    digits[digits.lastIndex] = digits.last() + 1

    var reminder = 0
    if (digits.last() > 9) {
        for (i in digits.size - 1 downTo 0) {
            digits[i] = digits[i] + reminder
            reminder = digits[i] / 10
            digits[i] = digits[i] % 10

            if (reminder == 0) return digits
        }
    }

    val arr = IntArray(digits.size + 1)
    arr[0] = 1
    return arr
}