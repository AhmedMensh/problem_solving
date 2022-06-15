
fun main() {

    val res =gradingStudents(arrayOf(44, 84, 94, 21,0,18,100,18,62,30,61,53,0,43,2,29,53,61,40,14))
    for (i in res.indices) println(res[i])
}

fun gradingStudents(grades: Array<Int>): Array<Int> {
    // Write your code here
    for (i in grades.indices){

        when{
            grades[i] < 38 ->  grades[i] = grades[i]
            (grades[i] % 10 )  == 3 || (grades[i] % 10 )  == 8 ->  grades[i] = grades[i] + 2
            (grades[i] % 10 )  == 4 || (grades[i] % 10 )  == 9 ->  grades[i] = grades[i] + 1
            else -> grades[i] = grades[i]
        }

    }

    return grades
}