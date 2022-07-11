package leetcode.linked_list

fun main() {
    val n1 = ListNode(0)
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

    var res = mergeNodes(n1)
    while (res != null) {
        println(res.`val`)
        res = res.next
    }
}

fun mergeNodes(head: ListNode?): ListNode? {

    if (head?.next == null) return head

    var current = head.next
    var preivous = head

    while (current?.next != null) {
        if (current.`val` == 0) {

            preivous?.next = current
            preivous = current
            current = current.next
        } else {
            preivous?.`val` = preivous?.`val`?.plus(current.`val`)!!
            current = current.next
        }
    }
    preivous?.next = null

    return head
}