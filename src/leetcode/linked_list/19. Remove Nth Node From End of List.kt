package leetcode.linked_list

fun main() {
    val node1 = ListNode(1)
    val node2 = ListNode(2)
    val node3 = ListNode(3)
    val node4 = ListNode(4)
    val node5 = ListNode(5)

    node1.next = node2
    node2.next = node3
    node3.next = node4
    node4.next = node5

    var res = removeNthFromEnd(node1,1)
        while (res != null){
        println(res.`val`)
        res = res.next
    }
}
fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {


    var first = head
    var second = head

    for (i in 0 until n){
        second = second?.next
    }

    if (second == null) return first?.next
    while (second?.next != null){
        first = first?.next
        second = second.next
    }


    first?.next = first?.next?.next
    return  head
}