package leetcode

fun main() {

    val res = countMatches(
        listOf(
            listOf("phone", "blue", "pixel"),
            listOf("computer", "silver", "lenovo"),
            listOf("phone", "gold", "iphone"),
        ), "color", "silver"
    )

    print(res)
}

fun countMatches(items: List<List<String>>, ruleKey: String, ruleValue: String): Int {

    var count = 0

    items.forEach {

        val isMatched = ("type" == ruleKey && it[0] == ruleValue)
                || ("color" == ruleKey && it[1] == ruleValue)
                || ("name" == ruleKey && it[2] == ruleValue)
        if (isMatched) count++
    }
    return count
}