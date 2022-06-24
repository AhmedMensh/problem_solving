package leetcode.linked_list


fun main() {
    val listNode = ListNode(1)
    listNode.next = ListNode(0)

    getDecimalValue(listNode)
}

private fun getDecimalValue(head: ListNode?): Int {

    var current = head
    var result = 0
    while (current != null){
        result = result shl 1
        result += current.`val`
        current = current.next
    }
    return result
}