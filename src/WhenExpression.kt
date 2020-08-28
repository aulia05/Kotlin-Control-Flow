fun main(){
    val value = 5
    val ranges = 10..20

    when(value){
        in ranges -> println("value is in the range")
        !in ranges -> println("value is outside the range")
        else -> println("value undefined")
    }
}