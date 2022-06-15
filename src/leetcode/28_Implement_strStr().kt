package leetcode

fun main() {
    val res = strStr("hello", "ll")
//    print(res)
}

fun strStr(haystack: String, needle: String): Int {

    if (needle.isEmpty()) return 0
    var needleIndex = 0
    var haystackIndex = 0
    while (haystackIndex < haystack.length && needle.length < needleIndex) {

    }
    haystack.forEachIndexed { index, c ->
        if (needleIndex < needle.length && c == needle[needleIndex]) {
            needleIndex++
        }
    }
    println(needle.length)
    println(needleIndex)
    return if (needleIndex == needle.length) needleIndex else -1
}