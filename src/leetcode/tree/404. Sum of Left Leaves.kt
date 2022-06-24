package leetcode.tree

fun main() {

}

//
// Example:
 var ti = TreeNode(5)
 var v = ti.`val`
 // Definition for a binary tree node.
  class TreeNode(var `val`: Int) {
      var left: TreeNode? = null
      var right: TreeNode? = null
  }

class Solution1 {
    var sum =0
    fun sumOfLeftLeaves(root: TreeNode?): Int {

        if (root == null ||(root.left == null && root.right == null)) return sum

        sol(root,false)
        return sum
    }

    fun sol(root: TreeNode?, isLeft : Boolean) {

        if (root == null ) return
        if(isLeft && root.left == null && root.right == null) sum+=root.`val`

        sol(root.left,true)
        sol(root.right,false)

    }
}