package one.digitalinovation.collections

fun main(){
    val joao = Funcionario("João", 1500.0, "CLT")
    val pedro = Funcionario("Pedro", 1000.0, "CLT")
    val maria = Funcionario("Maria", 4000.0, "PJ")

    println("============LIST============")
    //cria lista mutavel
    val funcionarios = mutableListOf(joao, maria)
    funcionarios.forEach { println(it) }

    println("====================")
    funcionarios.add(pedro)     //adiciona elemento na lista
    funcionarios.forEach { println(it) }

    println("====================")
    funcionarios.remove(joao)   //remove elemento da lista
    funcionarios.forEach { println(it) }

    println("============SET============")
    //cria conjutno mutavel
    val funcionariosSet = mutableSetOf(joao)
    funcionariosSet.forEach { println(it) }

    println("====================")
    funcionariosSet.add(pedro)  //adiciona elemento no conjunto
    funcionariosSet.add(maria)
    funcionariosSet.forEach { println(it) }

    println("====================")
    funcionariosSet.remove(maria)   //remove elemento do conjunto
    funcionariosSet.forEach { println(it) }

}