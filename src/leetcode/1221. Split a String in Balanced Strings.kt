package leetcode

import java.util.*

fun main() {

    print(
        balancedStringSplit("RLLLLRRRLR")
    )
}

fun balancedStringSplit(s: String): Int {


    var count = 0

    var lCounts = 0

    s.forEach {
        when (it) {
            'L' -> {
                lCounts++
            }
            'R' -> {
                lCounts--
            }
        }
        if (lCounts == 0) count++


    }
//    val stack = Stack<Char>()
//    s.forEach {
//        if (!stack.isEmpty() &&
//            ((stack.peek() == 'L' && it == 'R') || (stack.peek() == 'R' && it == 'L')))
//            stack.pop()
//
//        else stack.push(it)
//
//        if (stack.isEmpty()) count++
//
//    }
    return count
}