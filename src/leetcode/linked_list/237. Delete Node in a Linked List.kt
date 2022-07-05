package leetcode.linked_list


fun main() {
    val ls1 = ListNode(1)
    val ls2 = ListNode(5)
    val ls3 = ListNode(4)
    val ls4 = ListNode(9)
//    val l5 = ListNode(9)
//    val l6 = ListNode(9)
//    val l7 = ListNode(9)
    ls1.next = ls2
    ls2.next = ls3
    ls3.next = ls4
//    l4.next = l5
//    l5.next = l6
//    l6.next = l7
    var res = deleteNode(ls3)

    while (res != null) {
        println(res)
        res = res.next
    }
}

fun deleteNode(node: ListNode?): ListNode? {

    node?.`val` = node?.next?.`val`!!
    node.next = node.next!!.next
    return node
}