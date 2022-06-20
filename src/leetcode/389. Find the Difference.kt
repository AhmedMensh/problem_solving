package leetcode

fun main() {

    print(findTheDifference("abcd","abcde"))
}
fun findTheDifference(s: String, t: String): Char {


    val  hashMap : HashMap<Char,Int> = hashMapOf()
    for (i in t.indices){
        hashMap[t[i]] = hashMap[t[i]]?.plus(1) ?: 1
        if (i < s.length){
            hashMap[s[i]] = hashMap[s[i]]?.plus(1) ?: 1

        }
    }
    hashMap.forEach{
        if (it.value %2 != 0) return it.key
    }


    return ' '
}