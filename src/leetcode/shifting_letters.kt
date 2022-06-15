package leetcode

import java.lang.StringBuilder
import kotlin.Char

fun main() {

   val res =  shiftingLetters("mkgfzkkuxownxvfvxasy", intArrayOf(505870226,437526072,266740649,224336793,532917782,311122363,567754492,595798950,81520022,684110326,137742843,275267355,856903962,148291585,919054234,467541837,622939912,116899933,983296461,536563513))
    println(res)
}

fun shiftingLetters(s: String, shifts: IntArray): String {

    var shiftingValue  : Long = 0L
    shifts.forEach {
        shiftingValue += it
    }
    val result = StringBuilder()
    for (i in s.indices){
        result.append(shiftLatterByN(s[i],shiftingValue))
        shiftingValue -= shifts[i]
    }
    return result.toString()
}
fun shiftLatterByN(char: Char,n : Long): Char {

    val charCode = char.toInt()
    var shiftedCharCode = charCode + (n %26)
    if (shiftedCharCode > 122) shiftedCharCode -=26

    return shiftedCharCode.toChar()
}

