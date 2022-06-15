package leetcode

import java.lang.StringBuilder

fun main() {
    val res = interpret("(al)G(al)()()G")
    println(res)
}

fun interpret(command: String): String {

    val res = StringBuilder()
//    var index = 0
//    while (index < command.length) {
//        if (command[index] == 'G') {
//            res.append("G")
//            index++
//        } else if (command[index] == '(' && command[index + 1] == ')') {
//            res.append("o")
//            index+=2
//        } else {
//            res.append("al")
//            index += 4
//        }
//
//    }

    for (i in command.indices){
        when(command[i]){
            'G' -> res.append("G")
            ')' -> {
                if (command[i-1]=='(') res.append("o") else res.append("al")
            }
        }
    }
    return res.toString()
}