fun main() {

    print(getParkingCost(10,13))
}


fun getParkingCost(startDate: Int, endDate: Int) :Int{

    var totalParkingCost = 0
    for (i in startDate until endDate){

        totalParkingCost += when (i) {
            in 0 until 6 -> 5
            in 6 until 12 -> 3
            else -> 4
        }
    }
    return  totalParkingCost
}