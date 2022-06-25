package leetcode

import java.util.*

fun main() {

      val obj = MyQueue()
      obj.push(1)
      obj.push(2)
      obj.push(3)
      obj.push(4)
      obj.push(5)
      println(obj.pop())
      println(obj.pop())
      println(obj.pop())
      println(obj.pop())
      println(obj.pop())
      println(obj.pop())
      println(obj.empty())

}
class MyQueue {

    private val firstStack = Stack<Int>()
    private val secondStack = Stack<Int>()
    fun push(x: Int) = firstStack.push(x)



    fun pop(): Int {

        if (firstStack.isEmpty() && secondStack.isEmpty()) return -1
        if (secondStack.isNotEmpty()) return secondStack.pop()
        else fillSecondStack()

        return secondStack.pop()
    }

    fun peek(): Int {
        if (firstStack.isEmpty() && secondStack.isEmpty()) return -1
        if (secondStack.isNotEmpty()) return secondStack.peek()
        else fillSecondStack()

        return secondStack.peek()
    }


    fun empty(): Boolean {

        if (firstStack.isEmpty() && secondStack.isEmpty()) return true
        return false

    }

    private fun fillSecondStack(){
        while (firstStack.isNotEmpty()){
            secondStack.push(firstStack.pop())
        }
    }
}


