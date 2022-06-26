package leetcode


fun main() {
    val parkingSystem = ParkingSystem(1,1,1)
    println(parkingSystem.addCar(1))
    println(parkingSystem.addCar(2))
    println(parkingSystem.addCar(3))
    println(parkingSystem.addCar(1))
    println(parkingSystem.addCar(2))
    println(parkingSystem.addCar(3))
}
//big =1
//medium =2
//small =3

class ParkingSystem(var big: Int, var medium: Int,var small: Int) {


    fun addCar(carType: Int): Boolean {

        return when (carType) {
            1 -> big-- >0
            2 -> medium-- >0
            3 -> small-- >0
            else -> false
        }
    }

}



/**
 * Your ParkingSystem object will be instantiated and called as such:
 * var obj = ParkingSystem(big, medium, small)
 * var param_1 = obj.addCar(carType)
 */