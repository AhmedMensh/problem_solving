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


    var res = removeElements(n1,1)
    while (res != null){
        println(res.`val`)
        res = res.next
    }
}
fun removeElements(head: ListNode?, `val`: Int): ListNode? {


    if (head == null) return head
    if (head.`val` == `val`) return removeElements(head.next,`val`)
    val result = head
    var current = head
    var preivous = head
    while (current != null){

        if (current.`val` == `val`){
            preivous?.next = current.next
        }else{
            preivous = current
        }


        current = current.next
    }

    return result
}