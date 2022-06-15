package leetcode

import java.lang.StringBuilder

fun main() {
    print(longestCommonPrefix(arrayOf("ab","a")))
}

fun longestCommonPrefix(strs: Array<String>): String {

    if (strs.size==1) return strs.first()
    val prefixString = StringBuilder()
    val minimumLength = getMinimumStringLengthAtArray(strs)
    for(i in 0 until minimumLength){
        for (j in 0..strs.size -2){

            if (strs[j].isEmpty() || strs[j][i] != strs[j+1][i]){
                return prefixString.toString()

            }

        }
        prefixString.append(strs[0][i]).toString()
    }
    return prefixString.toString()
}

fun getMinimumStringLengthAtArray(strs: Array<String>):Int{
    var minimumength = strs.first().length
    for (i in strs.indices){
        if (strs[i].length < minimumength){
            minimumength = strs[i].length
        }
    }
    return minimumength
}