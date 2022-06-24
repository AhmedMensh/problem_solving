package leetcode.tree

fun main() {

    val treeNode1 = TreeNode(5)
    val treeNode2 = TreeNode(5)
    val treeNode3 = TreeNode(5)
    treeNode1.left = treeNode2
    treeNode1.right = treeNode3

    print(maxDepth(treeNode1)
    )

}


fun maxDepth(root: TreeNode?): Int {
    return maxDepth(root,0)
}

fun maxDepth(root: TreeNode?,maxDepth : Int): Int {

    if (root == null) return maxDepth

    val maxLeft = maxDepth(root.left,maxDepth+1)
    val maxRight = maxDepth(root.right,maxDepth+1)

    return Math.max(maxLeft ,maxRight)
}