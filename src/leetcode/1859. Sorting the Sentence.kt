package leetcode

fun main() {

    println(sortSentence("is2 sentence4 This1 a3"))
}

fun sortSentence(s: String): String {

    val list = s.split(" ").toMutableList()
    val array= Array(list.size){""}

    for (i in list.indices) {
        val wordIndex = "${list[i].last()}".toInt()-1
        array[wordIndex] = list[i].dropLast(1)
    }
    return array.joinToString(" ")
}