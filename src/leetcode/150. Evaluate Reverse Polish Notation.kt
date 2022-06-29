package leetcode

import java.util.*

fun main() {
    print(evalRPN(arrayOf("10","6","9","3","+","-11","*","/","*","17","+","5","+")))
}
fun evalRPN(tokens: Array<String>): Int {

    val stack = Stack<String>()

    tokens.forEach {
        when(it){

            "-" -> {
                val secondNumber = stack.pop()
                val firstNumber = stack.pop()
                stack.push("${firstNumber.toInt() -secondNumber.toInt()}")
            }
            "+" -> {
                val secondNumber = stack.pop()
                val firstNumber = stack.pop()
                stack.push("${firstNumber.toInt() + secondNumber.toInt()}")
            }
            "*" -> {
                val secondNumber = stack.pop()
                val firstNumber = stack.pop()
                stack.push("${firstNumber.toInt() *secondNumber.toInt()}")
            }
            "/" -> {
                val secondNumber = stack.pop()
                val firstNumber = stack.pop()
                stack.push("${firstNumber.toInt() /secondNumber.toInt()}")
            }
            else -> { stack.push(it)}
        }
    }

    return stack.pop().toInt()
}
