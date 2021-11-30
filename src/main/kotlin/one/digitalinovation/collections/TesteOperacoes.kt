package one.digitalinovation.collections

fun main() {
    val salarios = doubleArrayOf(2000.0, 1000.0, 5000.0)
    for(salario in salarios){
        println(salario)
    }
    println("==================")
    println("Maior salário: ${salarios.maxOrNull()}")
    println("Menor salário: ${salarios.minOrNull()}")
    println("Médio salário: ${salarios.average()}")

    val salarioMAiorQue = salarios.filter { it > 1000.0 }
    println("==================")
    salarioMAiorQue.forEach(){ println(it) }

    println("==================")
    println(salarios.count{it in 2000.0..5000.0 })

    println("==================")
    println(salarios.find { it == 1000.0 })

    println("==================")
    println(salarios.any { it == 1000.0 })

}