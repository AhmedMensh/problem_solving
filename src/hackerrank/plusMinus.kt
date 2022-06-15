
    fun main(args: Array<String>) {
        val arr = IntArray(7)
        arr[0] = 6
        arr[1] = -4
        arr[2] = 3
        arr[3] = -9
        arr[4] = 0
        arr[5] = 4
        arr[6] = 1
        var positiveFraction = 0.0f
        var negativeFraction = 0.0f
        var zeroFraction = 0.0f
        for (value in arr) {
            println(value)
            if (value == 0) zeroFraction += 1f else if (value > 0) positiveFraction += 1f else negativeFraction += 1f
        }
        println(positiveFraction / arr.size)
        println(negativeFraction / arr.size)
        println(zeroFraction / arr.size)
    }
