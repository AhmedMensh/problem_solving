package leetcode

import java.lang.StringBuilder

fun main() {
    print(longestPalindrome("cbbd"))
}
fun longestPalindrome(s: String): String {

    var longestPalindrome = s.first().toString()
    for (i in s.indices){
        val string = getPalindrome(i,s)
        if (string.length > longestPalindrome.length) longestPalindrome = string
    }
    return longestPalindrome
}

private fun getPalindrome(center : Int,str : String) : String{

    val first = getPalindromeAtCenter(center -1, center +1, str)
    val second = getPalindromeAtCenter(center, center +1, str)

   if (first.length >= second.length) return first
    return second
}

private fun getPalindromeAtCenter(start : Int , end : Int ,str: String) : String{
    var s =start
    var e = end
    var palindromeString = ""
    while (s >= 0 && e < str.length){

        if (str[s] != str[e]) return palindromeString
        palindromeString = str.substring(s--,++e)

    }
    return palindromeString
}