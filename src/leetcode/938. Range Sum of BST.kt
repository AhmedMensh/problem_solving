package leetcode

import leetcode.tree.TreeNode

/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
private class SolutionT {
    var sum = 0
    fun rangeSumBST(root: TreeNode?, low: Int, high: Int): Int {

        if (root == null) return sum
        if (root.`val` in low..high) sum+=root.`val`
        rangeSumBST(root.left,low, high)
        rangeSumBST(root.right,low, high)
        return sum
    }
}