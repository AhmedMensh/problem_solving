package leetcode.tree

fun inorderTraversal(root: TreeNode?): List<Int> {

    val list : MutableList<Int> = mutableListOf()
    inorderTraversal(root,list)
    return list
}



fun inorderTraversal(root: TreeNode?, list: MutableList<Int>) {

    if (root == null) return
    inorderTraversal(root.left,list)
    list.add(root.`val`)
    inorderTraversal(root.right,list)
}