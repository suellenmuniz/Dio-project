package one.digitalInovation.dig1onebank

class Pessoa {
    var nome: String = "Suellen"
    var cpf: String = "075.364.865-29"
    private set


}

fun main() {
    val Suellen = Pessoa()

    println(Suellen)
    println(Suellen.nome)
    println(Suellen.cpf)


}