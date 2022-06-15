


    fun main(args: Array<String>) {
        stairCase(5)
    }

    private fun stairCase(n: Int) {
        for (i in 1..n) {
            for (j in n downTo 1) {
                if (j > i) print(" ") else print("#")
            }
            print("\n")
        }
    }
