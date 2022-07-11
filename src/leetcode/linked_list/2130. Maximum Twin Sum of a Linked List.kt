package leetcode.linked_list


fun main() {
    val n1 = ListNode(5)
    val n2 = ListNode(1)
    val n3 = ListNode(2)
    val n4 = ListNode(0)
    val n5 = ListNode(3)
    val n6 = ListNode(4)
    val n7 = ListNode(0)
    n1.next = n2
    n2.next = n3
    n3.next = n4
    n4.next = n5
    n5.next = n6
    n6.next = n7
    println(
        pairSum(n1)
    )
}

fun pairSum(head: ListNode?): Int {

    var current = head
    while (current?.next != null) {
        current = current.next
    }

    return current?.`val`?.let { head?.`val`?.plus(it) } ?: 0
}