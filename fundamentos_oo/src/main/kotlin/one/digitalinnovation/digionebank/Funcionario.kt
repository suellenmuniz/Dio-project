package one.digitalinnovation.digionebank

import one.digitalInovation.dig1onebank.Pessoa
import java.math.BigDecimal

class Funcionario(
    override val nome: String,
    override val cpf: String,
    val salario: BigDecimal
) : Pessoa(nome, cpf) {

}

