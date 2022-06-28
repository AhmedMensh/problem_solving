package leetcode.linked_list

fun main() {
    val l1 = ListNode(1)
    val l2 = ListNode(2)
    val l3 = ListNode(3)
//    val l4 = ListNode(9)
//    val l5 = ListNode(9)
//    val l6 = ListNode(9)
//    val l7 = ListNode(9)
    l1.next = l2
    l2.next = l3
//    l3.next = l4
//    l4.next = l5
//    l5.next = l6
//    l6.next = l7


    val x1 = ListNode(4)
    val x2 = ListNode(5)
    val x3 = ListNode(6)
//    val x4 = ListNode(9)

    x1.next = x2
    x2.next = x3
//    x3.next = x4

    var head = mergeTwoLists(l1,x1)
    while (head != null){
        println(head.`val`)
        head = head.next
    }
}

fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {

    if (list1 == null) return list2
    if (list2 == null) return list1

    val resultNode = ListNode(0)
    if (list1.`val` < list2.`val`){
        resultNode.`val` = list1.`val`
        resultNode.next = mergeTwoLists(list1.next,list2)
    }
    else {
        resultNode.`val` = list2.`val`
        resultNode.next = mergeTwoLists(list1,list2.next)
    }

    return resultNode
}
