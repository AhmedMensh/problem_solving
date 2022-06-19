package leetcode

fun main() {

    print(areAlmostEqual("aa",  "ac"))
}

fun areAlmostEqual(s1: String, s2: String): Boolean {

    if (s1 == s2) return true

    var indexOfFirstMismatch = -1
    var indexOfSecondMismatch = -1
    var numberOfMismatch = 0
    for (i in s1.indices) {
        if (s1[i] != s2[i]) {
            when (numberOfMismatch) {
                0 -> indexOfFirstMismatch = i
                1 -> indexOfSecondMismatch = i
                else -> return false
            }
            numberOfMismatch++
        }
    }

    if (indexOfFirstMismatch == -1 || indexOfSecondMismatch == -1) return false
    if (s1[indexOfFirstMismatch] == s2[indexOfSecondMismatch]
        && s1[indexOfSecondMismatch] == s2[indexOfFirstMismatch]) return true

    return false
}