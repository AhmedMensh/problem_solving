

    fun main(args: Array<String>) {
        val arr = intArrayOf(2, 5, 0, 10, 4)

        miniMaxSum(arr)
    }

    fun miniMaxSum(arr: IntArray) {
        var sum: Long = 0
        for (i in arr.indices) {
            for (j in i + 1 until arr.size) {
                if (arr[j] < arr[i]) {
                    val temp = arr[j]
                    arr[j] = arr[i]
                    arr[i] = temp
                }
            }
            sum += arr[i]
        }
        println((sum - arr[arr.size - 1]).toString() + " " + (sum - arr[0]))
    }
