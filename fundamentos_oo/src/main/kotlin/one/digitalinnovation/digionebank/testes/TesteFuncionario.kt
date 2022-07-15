package one.digitalinnovation.digionebank.testes

import one.digitalInovation.dig1onebank.Pessoa
import one.digitalinnovation.digionebank.Funcionario
import java.math.BigDecimal

fun main() {
    val Suellen = Pessoa(nome = "Suellen Muniz", cpf = "075.364.865-29")

    println(Suellen.nome)
    println(Suellen.cpf)

    val Joao = Funcionario(nome = "Suellen Muniz", cpf = "075.364.865-29", BigDecimal.valueOf(2000.0))
    println(Joao.nome)
    println(Joao.cpf)
    println(Joao.salario)
}