package one.digitalinovation.collections

fun main(){
    val values = intArrayOf(10, 12, 15, 20, 25, 5)

    values.forEach(){
        println(it)
    }

    println("==============")
    values.sort()
    values.forEach {
        println(it)
    }

}