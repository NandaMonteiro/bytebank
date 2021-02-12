fun main() {
    println("Bem Vindo ao Bytebank")

    val nanda = Funcionario(
        nome = "Fernanda",
        cpf = "111.222.333-45",
        salario = 100.00
    )

    println("Nome ${nanda.nome}")
    println("Bonificação ${nanda.bonificacao()}")
}



