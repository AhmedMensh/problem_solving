package leetcode

fun main() {

    val res = defangIPaddr("192.168.1.1")
    print(res)
}
fun defangIPaddr(address: String): String {

    return address.replace(".","[.]")
}