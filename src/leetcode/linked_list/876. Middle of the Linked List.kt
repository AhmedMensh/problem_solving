package leetcode.linked_list

fun main() {


    val listNode1 = ListNode(1)
    val listNode2 = ListNode(2)
    val listNode3 = ListNode(3)
    val listNode4 = ListNode(4)
    val listNode5 = ListNode(5)
    val listNode6 = ListNode(6)

    listNode1.next = listNode2
    listNode2.next = listNode3
    listNode3.next =listNode4
    listNode4.next = listNode5
    listNode5.next = listNode6

    println(middleNode(listNode1)
    )
}

private fun middleNode(head: ListNode?): ListNode? {

    var current = head
    var sizeOfLinkedList =0
    val hashMap : HashMap<Int ,ListNode> = hashMapOf()
    while (current != null){
        sizeOfLinkedList++
        hashMap[sizeOfLinkedList] = current
        current= current.next

    }

    val middleIndex =  (sizeOfLinkedList/2)+1
    return hashMap[middleIndex]
}