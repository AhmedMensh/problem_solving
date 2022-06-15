package leetcode

fun main() {
    mostWordsFound(arrayOf("trr ty nbn"))
}
fun mostWordsFound(sentences: Array<String>): Int {

    var result = 0

    sentences.forEach {
        val counts = it.count { it == ' ' }
        if (counts > result) result = counts
    }
    return result +1
}