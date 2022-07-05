package leetcode

import java.lang.StringBuilder

fun main() {
    print('a' -'0')
}
fun addBinary(a: String, b: String): String {

    val max = Math.max(a.length,b.length)
    var cary = '0'
    val result = StringBuilder()
    for (i in 0..max){
        when{
            a[i] == null ->{
                result.append(b[i])
            }
            b[i] == null ->{
                result.append(a[i])
            }
            else ->{

                if (a[i] =='1' && b[i] == '1') result.append('1')
                else result.append('0')
            }
        }
    }

    return result.toString()
}