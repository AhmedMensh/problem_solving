package leetcode.linked_list


fun main() {

    val l1 = ListNode(9)
    val l2 = ListNode(9)
    val l3 = ListNode(9)
    val l4 = ListNode(9)
    val l5 = ListNode(9)
    val l6 = ListNode(9)
    val l7 = ListNode(9)
    l1.next = l2
    l2.next = l3
    l3.next = l4
    l4.next = l5
    l5.next = l6
    l6.next = l7


    val x1 = ListNode(9)
    val x2 = ListNode(9)
    val x3 = ListNode(9)
    val x4 = ListNode(9)

    x1.next = x2
    x2.next = x3
    x3.next = x4
    var res = addTwoNumbers(l1, x1)
    while (res != null) {
        println(res.`val`)
        res = res.next
    }
}

fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
    var firstNode = l1
    var secondNode = l2
    var previousNode: ListNode? = null
    var headNode: ListNode? = null
    var reminder = 0
    while (firstNode != null || secondNode != null || reminder != 0) {

        var sumOfTowNodes = firstNode?.`val` ?: 0
        sumOfTowNodes += secondNode?.`val` ?: 0
        sumOfTowNodes += reminder

        reminder = sumOfTowNodes / 10
        val node = ListNode(`val` = sumOfTowNodes % 10)
        if (previousNode == null) headNode = node
        previousNode?.next = node
        previousNode = node
        firstNode = firstNode?.next
        secondNode = secondNode?.next
    }

    return headNode
}

