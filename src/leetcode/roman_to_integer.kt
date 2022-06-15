package leetcode

fun main() {

    println(romanToInt("MCMXCIV"))
}

fun romanToInt(s: String): Int {

    var result = 0
    val romansNumbers = HashMap<Char, Int>()
    romansNumbers['I'] = 1
    romansNumbers['V'] = 5
    romansNumbers['X'] = 10
    romansNumbers['L'] = 50
    romansNumbers['C'] = 100
    romansNumbers['D'] = 500
    romansNumbers['M'] = 1000

    var i = 0
    while (i < s.length) {
        if (i != s.length - 1 && romansNumbers[s[i]]!! < romansNumbers[s[i + 1]]!!) {
            result += romansNumbers[s[i + 1]]!! - romansNumbers[s[i]]!!
            i += 2
        } else {
            result += romansNumbers[s[i]]!!
            i++
        }
    }

    return result
}