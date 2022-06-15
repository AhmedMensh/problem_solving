package leetcode

import com.sun.xml.internal.fastinfoset.util.StringArray
import kotlin.text.StringBuilder

fun main() {

    val res = restoreString("codeleet", intArrayOf(4, 5, 6, 7, 0, 2, 1, 3))
    print(res)
}

fun restoreString(s: String, indices: IntArray): String {

    val result = StringBuilder(s.length)
    result.append(s)
    for (i in indices.indices) {
        result.setCharAt(indices[i], s[i])
    }

//    println()
//    sortedStringArray.forEach {
//        result.append(it)
//    }
//    val indexedCharMap : MutableMap<Int,Char> = mutableMapOf()
//
//    for (i in s.indices){
//        indexedCharMap[indices[i]] = s[i]
//    }
//    indexedCharMap.toSortedMap().values.map {
//        result.append(it)
//    }

    return result.toString()
}