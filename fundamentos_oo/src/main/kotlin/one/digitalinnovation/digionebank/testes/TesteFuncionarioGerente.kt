package one.digitalinnovation.digionebank.testes


import one.digitalinnovation.digionebank.Gerente

fun main() {
    val Maria = Gerente("Maria do Carmo","44465557", 5000.0, "senha123")
    ImprimeRelatorioFuncionario.imprime(Maria)

    TesteAutenticacao().autentica(Maria)
}


