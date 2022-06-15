fun main() {

    print(camelcase("ahmedMenshMetwaalAn"))
}




// Complete the camelcase function below.
fun camelcase(s: String): Int {

    return s.filter { it.code in 65..90 }.count() +1

}
