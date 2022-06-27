package leetcode

import java.lang.StringBuilder

fun main() {
    convert("PAYPALISHIRING",3)
}
fun convert(s: String, numRows: Int): String {

    if (numRows == 1 || s.isEmpty()) return s
    val stringBuilder = StringBuilder()
    val step = (numRows*2) -2
    for (i in 0 until numRows){
        var index =i
        while ( index < s.length){
            print(s[index])
            stringBuilder.append(s[index])
            if (i in 1 until numRows-1 && (index + (step-i-i) < s.length)){
                stringBuilder.append(s[index + (step-i-i)])
                print(s[index + (step-i-i)])
            }
            index +=step
        }
    }

    return stringBuilder.toString()
}