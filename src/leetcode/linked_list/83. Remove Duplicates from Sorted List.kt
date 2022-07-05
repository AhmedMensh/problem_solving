package leetcode.linked_list

fun main() {
    val node1 = ListNode(1)
    val node2 = ListNode(2)
    val node3 = ListNode(2)
    val node4 = ListNode(2)
    val node5 = ListNode(2)

    node1.next = node2
    node2.next = node3
    node3.next = node4
    node4.next = node5

    var res = deleteDuplicates(node1)
    while (res != null) {
        println(res.`val`)
        res = res.next
    }
}

fun deleteDuplicates(head: ListNode?): ListNode? {

    var current = head
    var previous: ListNode? = null

    while (current != null) {

        if (previous?.`val` == current.`val`) {
            previous.next = current.next
            current = current.next
        }else{

            previous = current
            current = current?.next
        }

    }

    return head
}