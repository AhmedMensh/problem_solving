

fun main() {

//    7 11
//    5 15
//    3 2
//    -2 2 1
//    5 -6

    countApplesAndOranges(7,11,5,15, arrayOf(-2,2,1), arrayOf(5,-6))
}


// Complete the countApplesAndOranges function below.
fun countApplesAndOranges(s: Int, t: Int, a: Int, b: Int, apples: Array<Int>, oranges: Array<Int>): Unit {

//
//    var numberOfApples = 0
//    var numberOfOranges = 0
//    for(i in apples.indices){
//        if (apples[i] +a in s..t) numberOfApples++
//    }
//
//    for(i in oranges.indices){
//        if (oranges[i] +b in s..t) numberOfOranges++
//    }
//    println(numberOfApples)
//    print(numberOfOranges)

    //

    println(apples.map { a + it }
            .filter { it in s..t }
            .count())


    print(oranges.map { b + it }
            .filter { it in s..t }
            .count())

}
