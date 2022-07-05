package leetcode.tree

import leetcode.linked_list.ListNode

fun main() {
//    isSubPath()
}
fun isSubPath(head: ListNode?, root: TreeNode?): Boolean {

    if (root == null || head == null) return true

    if (root.`val` == head.`val`){
        isSubPath(head.next,root.left)
        isSubPath(head.next,root.right)
    }else{
        isSubPath(head.next,root.left)
        isSubPath(head.next,root.right)
    }
    return true
}