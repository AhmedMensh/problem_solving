package leetcode

import java.lang.StringBuilder

fun main() {
    print(
        freqAlphabets("1326#")
    )
}

fun freqAlphabets(s: String): String {


    var index = 0
    val stringBuilder = StringBuilder()
    while (index < s.length) {
        if (index + 2 < s.length && s[index + 2] == '#') {
            val value = ("${s[index]}${s[index + 1]}").toInt()
            stringBuilder.append((value + 96).toChar())
            index += 3
        } else {
            val value = ("${s[index]}").toInt()
            stringBuilder.append((value + 96).toChar())
            index += 1
        }
    }
    return stringBuilder.toString()
}