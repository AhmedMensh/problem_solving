package leetcode

fun main() {

    cellsInRange("A1:F1")
}

fun cellsInRange(s: String): List<String> {

    val cells : MutableList<String> = mutableListOf()
    val column1 = s[0]
    val column2 = s[3]
    val row1 = s[1].toString().toInt()
    val row2 = s[4].toString().toInt()

    for (i in column1.toInt()..column2.toInt()){

        for (j in row1..row2){
            cells.add("${(i).toChar()}$j")
        }
    }

    return cells
}