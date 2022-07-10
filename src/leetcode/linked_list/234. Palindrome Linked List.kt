package leetcode.linked_list

fun main() {
    val n1 = ListNode(1)
    val n2 = ListNode(2)
    val n3 = ListNode(2)
    val n4 = ListNode(1)
//    val l5 = ListNode(9)
//    val l6 = ListNode(9)
//    val l7 = ListNode(9)
    n1.next = n2
    n2.next = n3
    n3.next = n4

    print(isPalindrome(n1))
}
fun isPalindrome(head: ListNode?): Boolean {

   val list : MutableList<Int> = mutableListOf()
    var current = head;
    while (current != null ){
        list.add(current.`val`)
        current = current.next
    }

    for (i in 0 until list.size){
        if (list[i] != list[list.size-1-i]) return false
    }

    return true
}