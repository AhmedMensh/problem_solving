package leetcode

import java.lang.StringBuilder

fun main() {
    print(
        mergeAlternately("abc", "wxyz")
    )
}

fun mergeAlternately(word1: String, word2: String): String {

    val stringBuilder = StringBuilder()

    val wordOneLength = word1.length
    val wordTowLength = word2.length
    var (i, j) = 0 to 0

    while (true){
        if(i<wordOneLength) stringBuilder.append(word1[i++])
        if(j<wordTowLength) stringBuilder.append(word2[j++])
        if (i == wordOneLength && j == wordTowLength) break
    }

    return stringBuilder.toString()
}