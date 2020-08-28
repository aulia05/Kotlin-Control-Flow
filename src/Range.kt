fun main(){
    val rangeInt = 1..20 step 4
    rangeInt.forEach {
        print("$it ")
    }
    println(rangeInt.step)
}