package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Banco

fun main() {
    val dig1OneBank = Banco(nome = "Dig1One", numero = 12)

    println(dig1OneBank.nome)
    println(dig1OneBank.numero)

    val banco2 = dig1OneBank.copy(nome = "banco2")

    println(banco2.info())

}