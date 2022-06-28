package leetcode.tree

fun main() {
    val treeNode1 = TreeNode(1)
    val treeNode2 = TreeNode(2)
    val treeNode3 = TreeNode(2)
    val treeNode4 = TreeNode(3)
    val treeNode5 = TreeNode(3)
    val treeNode6 = TreeNode(4)
    val treeNode7 = TreeNode(4)


    treeNode1.left = treeNode2
    treeNode1.right = treeNode3


    treeNode2.left = treeNode4
    treeNode2.right = treeNode5

    treeNode4.left = treeNode6
    treeNode4.right = treeNode7


    print(isBalanced(treeNode1))
}


//fun isBalanced(root: TreeNode?): Boolean {
//    return checkDepth(root) != -1
//}

private fun checkDepth(root: TreeNode?): Int {
    root ?: return 0
    val lDepth = checkDepth(root.left)
    val rDepth = checkDepth(root.right)
    return when {
        lDepth == -1 ||
                rDepth == -1 ||
                Math.abs(lDepth - rDepth) > 1 -> -1
        else -> 1 + maxOf(lDepth, rDepth)
    }
}
fun isBalanced(root: TreeNode?): Boolean {

    return getTreeHeight(root) != -1
}

fun getTreeHeight(root: TreeNode?): Int {

    root ?: return 0

    val heightOfLeft = getTreeHeight(root.left)
    val heightOfRight = getTreeHeight(root.right)
    return when {
        heightOfLeft == -1 ||
                heightOfRight == -1 ||
                Math.abs(heightOfLeft - heightOfRight) > 1 -> -1
        else -> 1 + maxOf(heightOfLeft, heightOfRight)
    }
}