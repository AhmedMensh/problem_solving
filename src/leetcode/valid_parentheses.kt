package leetcode

import java.util.*

fun main() {

    print(isValid("{()}"))
}

fun isValid(s: String): Boolean {

    if (s.isEmpty() || s.length % 2 != 0) return false

    val tempStack = Stack<Char>()
    for (i in s.indices) {
        if (tempStack.isEmpty()) {
            tempStack.push(s[i])
        } else if (tempStack.peek() == '(' && s[i] == ')'
            || tempStack.peek() == '{' && s[i] == '}'
            || tempStack.peek() == '[' && s[i] == ']') {
            tempStack.pop()
        }else tempStack.push(s[i])
    }

    return tempStack.isEmpty()
}