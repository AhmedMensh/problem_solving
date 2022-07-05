package leetcode.linked_list

fun main() {
    val ls1 = ListNode(1)
    val ls2 = ListNode(2)
    val ls3 = ListNode(3)
    val ls4 = ListNode(4)
//    val l5 = ListNode(9)
//    val l6 = ListNode(9)
//    val l7 = ListNode(9)
    ls1.next = ls2
//    ls2.next = ls3
//    ls3.next = ls4
//   var res = reverseList(ls1)
//    while (res != null){
//        println(res.`val`)
//        res = res.next
//    }

    print(getKNodeFromTheLast(ls1,1))
}
fun reverseList(head: ListNode?): ListNode? {

    var preivous : ListNode ?= null
    var current : ListNode ?= head


    while (current != null){

       val next = current.next
        current.next = preivous
        preivous = current
        current = next
    }
    return preivous
}

fun getKNodeFromTheLast(head: ListNode?,k : Int) : ListNode?{

    var first = head
    var second = head

    for (i in 0 until k){
        second = second?.next
    }

    while (second?.next != null){
        first = first?.next
        second = second.next
    }

    return  first
}


