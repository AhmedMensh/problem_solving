package leetcode

fun main() {

    print(
        isAlienSorted(arrayOf("apple","app"), "abcdefghijklmnopqrstuvwxyz")
    )
}

fun isAlienSorted(words: Array<String>, order: String): Boolean {

    for (i in 0 until words.size-1) {
        var x = 0
        var y = 0
        while (true) {

            if (y == words[i+1].length && y < words[i].length) return false
            if (x >= words[i].length
                || y >= words[i + 1].length
                || order.indexOf(words[i][x]) < order.indexOf(words[i + 1][y])
            ) break

            if (order.indexOf(words[i][x]) == order.indexOf(words[i + 1][y])) {
                x++
                y++
            } else return false
        }
    }
    return true
}