package leetcode

fun main() {
    print(lengthOfLongestSubstring("abcabcbb")
    )
}
fun lengthOfLongestSubstring(s: String): Int {

    var maxLength = 0
    val hashSet : HashSet<Char> = hashSetOf()
    for (i in s.indices){
        for (j in i until s.length){
            if (hashSet.contains(s[j])) break
            hashSet.add(s[j])
        }

        if (hashSet.size > maxLength) maxLength = hashSet.size
        hashSet.clear()
    }

    return maxLength
}

