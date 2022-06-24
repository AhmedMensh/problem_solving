package leetcode.tree


fun main() {

}




class SolutionPreOrder {
    val result : MutableList<Int> = mutableListOf()

    fun preorder(root: Node?): List<Int> {
        if (root == null) return result


        for (i in root.children.indices){
            preorder(root.children[i])
        }
        result.add(root.`val`)
        return result
    }
}