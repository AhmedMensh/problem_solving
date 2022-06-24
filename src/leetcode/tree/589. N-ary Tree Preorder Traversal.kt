package leetcode.tree


fun main() {

}

//  Definition for a Node.
  class Node(var `val`: Int) {
      var children: List<Node?> = listOf()
  }


class Solution {
   val result : MutableList<Int> = mutableListOf()

    fun preorder(root: Node?): List<Int> {
        if (root == null) return result
        result.add(root.`val`)

        for (i in root.children.indices){
            preorder(root.children[i])
        }
        return result
    }
}