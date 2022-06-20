package leetcode

import java.lang.StringBuilder


fun main() {
    print(
        toLowerCase("SDGDFSGSDFSD")
    )
}

fun toLowerCase(s: String): String {

    val stringBuilder = StringBuilder()
    s.forEach {
        if (it.toInt() in 65..90){
            stringBuilder.append((it.toInt()+32).toChar())
        }
        else stringBuilder.append(it)
    }
    return stringBuilder.toString()
}