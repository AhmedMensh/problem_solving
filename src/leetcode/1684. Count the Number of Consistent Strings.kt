package leetcode

fun main() {

    print(countConsistentStrings("ab", arrayOf("ad","bd","aaab","baa","badab"))
    )
}
fun countConsistentStrings(allowed: String, words: Array<String>): Int {

    var count = 0
    val allowedLetters : HashSet<Char> = hashSetOf()
    allowed.forEach { allowedLetters.add(it) }
    words.forEach {
      if(isConsistent(allowedLetters,it)) count++
    }
    return count
}

fun isConsistent(allowed: HashSet<Char>, word: String) : Boolean{
    word.forEach {
        if (!allowed.contains(it)) return false
    }
    return true
}