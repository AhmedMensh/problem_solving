



fun main() {
    superReducedString("aaabbccr")
}
fun superReducedString(s: String): String {

    var st = s
   lit@ for(i in 0..st.length-2){
        if (s[i] == s[i+1])  {
            st.drop(i)
            st.drop(i+1)
//            return@lit
        }
    }


    print(st)
    return s
}