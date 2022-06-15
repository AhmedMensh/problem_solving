fun main() {
    print(timeConversion("12:45:54PM"))
}
/*
 * Complete the timeConversion function below.
 */
fun timeConversion(s: String): String {
    /*
     * Write your code here.
     */



    val ss = s.split(":")
    var timeConverted = s
    if(ss[ss.lastIndex].toLowerCase().contains("pm")){
        if (ss[0] != "12")
        timeConverted = "${(ss[0].toInt() + 12)}:${ss[1]}:${ss[ss.lastIndex]}"

    }else if (ss[0] == "12") timeConverted = "00:${ss[1]}:${ss[ss.lastIndex]}"



    return timeConverted.dropLast(2)
}