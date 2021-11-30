package one.digitalinovation.collections

import java.math.BigDecimal

fun main() {
    val salarios = arrayOf(
        "1500".toBigDecimal(),
        "4000".toBigDecimal(),
        "2000".toBigDecimal()
    )

    println("======================")
    println(salarios.somatoria())

    println("======================")
    println(salarios.media())

}