package leetcode

fun main() {
    val res = strStr("abc", "c")
    print(res)
}

fun strStr(haystack: String, needle: String): Int {
    if (needle.isEmpty() || needle == haystack) return 0

    for (i in haystack.indices){
        var needleIndex = 0
        for (j in i until haystack.length){

            if (needleIndex == needle.length || haystack[j] != needle[needleIndex]) break
            needleIndex++
        }
        if (needleIndex == needle.length) return i
    }

    return -1
}