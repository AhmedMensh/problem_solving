package leetcode

fun main() {

   print( isAnagram("car","rat")
   )
}
fun isAnagram(s: String, t: String): Boolean {

    val hashMap : HashMap<Char,Int> = hashMapOf()
    s.forEach {
            hashMap[it] = hashMap[it]?.plus(1) ?: 1
    }

    t.forEach {
        if (hashMap.containsKey(it)){
            hashMap[it] = hashMap[it]?.minus(1) ?: 1
        }else return false
    }

    hashMap.values.forEach {
     if(it != 0) return false
    }
    return true
}