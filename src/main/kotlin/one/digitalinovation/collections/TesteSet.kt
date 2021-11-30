package one.digitalinovation.collections

fun main() {
    val joao = Funcionario("João", 1500.0, "CLT")
    val pedro = Funcionario("Pedro", 1000.0, "CLT")
    val maria = Funcionario("Maria", 4000.0, "PJ")

    val funcionarios1 = setOf(joao, pedro)
    val funcionarios2 = setOf(maria)

    //faz a junção dos objetos
    val resultUnion = funcionarios1.union(funcionarios2)
    resultUnion.forEach { println(it) }

    //imprime sem o objeto em comum
    println("====================")
    val funcionarios3 = setOf(joao, pedro, maria)
    val resultSubtract = funcionarios3.subtract(funcionarios2)
    resultSubtract.forEach { println(it) }

    //imprime objeto em comum
    println("====================")
    val resultIntersect = funcionarios3.intersect(funcionarios2)
    resultIntersect.forEach { println(it) }

}