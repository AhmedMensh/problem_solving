package leetcode.linked_list


fun main() {
    val n1 = ListNode(1)
    val n2 = ListNode(2)
    val n3 = ListNode(2)
    val n4 = ListNode(4)
//    val l5 = ListNode(9)
//    val l6 = ListNode(9)
//    val l7 = ListNode(9)
    n1.next = n2
    n2.next = n3
    n3.next = n4
    n4.next = n2


    print(hasCycle(n1))
}
fun hasCycle(head: ListNode?): Boolean {

    val hashSet : HashSet<ListNode> = hashSetOf()
    var current =head

    while (current != null){
        if (hashSet.contains(current)) return true
        hashSet.add(current)
        current = current.next
    }


    return false
}