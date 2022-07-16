package one.digitalinnovation.digionebank.testes


import one.digitalinnovation.digionebank.Analista
import one.digitalinnovation.digionebank.Funcionario

fun main() {
    val Joao = Analista("João Pedro","11123456", 2000.0 )
    ImprimeRelatorioFuncionario.imprime(Joao)

}


