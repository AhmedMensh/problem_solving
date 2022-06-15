package leetcode

fun countSubstrings(s: String): Int {

    var result = s.length
    for (i in s.indices){
        result+= getPalindromesCountAroundCent(s,i)
    }

    return result

}

fun getPalindromesCountAroundCent(str : String ,center : Int): Int {
    var count = 0
    count +=getPalindromesCount(str, center-1, center+1)
    count +=getPalindromesCount(str, center, center +1)

    return count

}

fun getPalindromesCount(str: String ,start : Int ,end : Int) : Int{
    var count = 0
    var s = start
    var e = end
    while (s >= 0 && e < str.length){
        if (str[s--] != str[e++]) break
        count++
    }
    return count
}
fun main() {
    println(countSubstrings("abc"))
}