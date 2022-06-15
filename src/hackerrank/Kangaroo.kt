fun main() {
    print(kangaroo(0,2,5,3))
}



// Complete the kangaroo function below.
fun kangaroo(x1: Int, v1: Int, x2: Int, v2: Int): String {

//    var nextPoint1 = x1+v1
//    var nextPoint2 = x2+v2
//
//    for(i in 1..10000){
//
//        if (nextPoint1 == nextPoint2) return "YES"
//        nextPoint1 += v1
//        nextPoint2 += v2
//    }
//
//    return "NO"

    if(v2 >= v1)
        println("NO")
    else
        println(if((x2 - x1) % (v1 - v2) == 0) "YES" else "NO")
    return ""
}
